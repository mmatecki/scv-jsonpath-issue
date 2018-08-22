import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name("Should create Person")
    request {
        method("POST")
        url("/persons")
        headers {
            contentType(applicationJson())
        }
        body(file("createPerson.json"))
        bodyMatchers {
            jsonPath('$.name', byRegex(nonEmpty()))
            jsonPath('$.surname', byRegex(nonEmpty()))
        }
    }

    response {
        status(201)
        headers {
            contentType(applicationJson())
            header "Location": regex(".*")
        }
        body([
                name   : fromRequest().body('$.name'),
                surname: fromRequest().body('$.surname'),
        ])
        bodyMatchers {
            jsonPath('$.name', byEquality())
            jsonPath('$.surname', byEquality())
        }
    }
}