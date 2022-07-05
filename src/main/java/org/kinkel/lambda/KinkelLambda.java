package org.kinkel.lambda;

import lombok.extern.slf4j.Slf4j;
import org.kinkel.lambda.service.MyService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Slf4j
@ApplicationScoped
@Path("/v1/greeting")
public class KinkelLambda {

    private final MyService myService;

    @Inject
    public KinkelLambda(final MyService myService) {
        this.myService = myService;
    }

    @GET
    @Produces(APPLICATION_JSON)
    public Response hello() {
        String result = myService.sayHi();
        return Response.ok(result).build();
    }

}
