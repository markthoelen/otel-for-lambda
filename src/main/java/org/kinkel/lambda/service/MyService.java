package org.kinkel.lambda.service;

import io.opentelemetry.extension.annotations.WithSpan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyService {

    @WithSpan
    public String sayHi() {
        return "Hi!";
    }
}
