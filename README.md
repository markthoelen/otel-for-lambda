
# Opentelemetry with Lambda
### overview
In this reproducer project shows Otel together with lambdas does not work. The `OtlpGrpcSpanExporter` is registered but it's `export` method is never called.

### How to run

 1. `mvn clean install`
 2. `sam local start-api` or `sam local start-api -d 5005` for remote debugging
 3. `curl --location --request GET 'http://127.0.0.1:3000/v1/greeting'`

If you debug it locally, you'll see that you never enter the `OtlpGrpcSpanExporter.export(Collection<SpanData> spans)` method.


### mvn quarkus:dev
Also when combining the lambda dependencies together with otel dependencies something breaks when running dev mode. You can check out the test `LambdaHandlerTest` if you want

