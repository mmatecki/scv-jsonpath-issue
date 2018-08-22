* gradlew clean generateClientStubs
* java -jar wiremock-standalone-2.18.0.jar --global-response-templating
* cd build/stubs/META-INF/com.example/demo/0.0.1-SNAPSHOT/mappings/rest 
* curl -X POST -d @Should\ create\ Person.json  http://localhost:8080/__admin/mappings
* curl -X POST --header "Content-Type: application/json" --data '{"name":"John", "surname": "Smith"}' http://localhost:8080/persons

Result:
```
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Error 500 Server Error</title>
</head>
<body><h2>HTTP ERROR 500</h2>
<p>Problem accessing /persons. Reason:
<pre>    Server Error</pre></p><h3>Caused by:</h3><pre>wiremock.com.github.jknack.handlebars.HandlebarsException: inline@7b07c2c2:1:15: could not find helper: &apos;jsonpath&apos;
{&quot;surname&quot;:&quot;{{{jsonpath this &apos;$.surname&apos;}}}&quot;,&quot;name&quot;:&quot;{{{jsonpath this &apos;$.name&apos;}}}&quot;}
               ^

        at wiremock.com.github.jknack.handlebars.internal.HbsErrorReporter.syntaxError(HbsErrorReporter.java:93)
        at wiremock.com.github.jknack.handlebars.internal.HbsParserFactory$1$1.reportError(HbsParserFactory.java:105)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.newVar(TemplateBuilder.java:404)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitTvar(TemplateBuilder.java:339)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitTvar(TemplateBuilder.java:87)
        at wiremock.com.github.jknack.handlebars.internal.HbsParser$TvarContext.accept(HbsParser.java:1247)
        at wiremock.org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visit(AbstractParseTreeVisitor.java:42)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visit(TemplateBuilder.java:157)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitStatement(TemplateBuilder.java:696)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitStatement(TemplateBuilder.java:87)
        at wiremock.com.github.jknack.handlebars.internal.HbsParser$StatementContext.accept(HbsParser.java:300)
        at wiremock.org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visit(AbstractParseTreeVisitor.java:42)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visit(TemplateBuilder.java:157)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitBody(TemplateBuilder.java:664)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitTemplate(TemplateBuilder.java:510)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visitTemplate(TemplateBuilder.java:87)
        at wiremock.com.github.jknack.handlebars.internal.HbsParser$TemplateContext.accept(HbsParser.java:153)
        at wiremock.org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visit(AbstractParseTreeVisitor.java:42)
        at wiremock.com.github.jknack.handlebars.internal.TemplateBuilder.visit(TemplateBuilder.java:157)
        at wiremock.com.github.jknack.handlebars.internal.HbsParserFactory$1.parse(HbsParserFactory.java:109)
        at wiremock.com.github.jknack.handlebars.cache.NullTemplateCache.get(NullTemplateCache.java:54)
        at wiremock.com.github.jknack.handlebars.Handlebars.compile(Handlebars.java:414)
        at wiremock.com.github.jknack.handlebars.Handlebars.compileInline(Handlebars.java:384)
        at wiremock.com.github.jknack.handlebars.Handlebars.compileInline(Handlebars.java:368)
        at com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer.uncheckedCompileTemplate(ResponseTemplateTransformer.java:161)
        at com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer.transform(ResponseTemplateTransformer.java:111)
        at com.github.tomakehurst.wiremock.stubbing.InMemoryStubMappings.applyTransformations(InMemoryStubMappings.java:91)
        at com.github.tomakehurst.wiremock.stubbing.InMemoryStubMappings.serveFor(InMemoryStubMappings.java:72)
        at com.github.tomakehurst.wiremock.core.WireMockApp.serveStubFor(WireMockApp.java:164)
        at com.github.tomakehurst.wiremock.http.StubRequestHandler.handleRequest(StubRequestHandler.java:50)
        at com.github.tomakehurst.wiremock.http.AbstractRequestHandler.handle(AbstractRequestHandler.java:44)
        at com.github.tomakehurst.wiremock.servlet.WireMockHandlerDispatchingServlet.service(WireMockHandlerDispatchingServlet.java:108)
        at javax.servlet.http.HttpServlet.service(HttpServlet.java:790)
        at wiremock.org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:812)
        at wiremock.org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:587)
        at wiremock.org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1127)
        at wiremock.org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:515)
        at wiremock.org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1061)
        at wiremock.org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)
        at wiremock.org.eclipse.jetty.servlets.gzip.GzipHandler.handle(GzipHandler.java:529)
        at wiremock.org.eclipse.jetty.server.handler.HandlerCollection.handle(HandlerCollection.java:110)
        at wiremock.org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:97)
        at wiremock.org.eclipse.jetty.server.Server.handle(Server.java:499)
        at wiremock.org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:311)
        at wiremock.org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:258)
        at wiremock.org.eclipse.jetty.io.AbstractConnection$2.run(AbstractConnection.java:544)
        at wiremock.org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:635)
        at wiremock.org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:555)
        at java.base/java.lang.Thread.run(Thread.java:844)
</pre>
<hr><i><small>Powered by Jetty://</small></i><hr/>

</body>
</html>
```