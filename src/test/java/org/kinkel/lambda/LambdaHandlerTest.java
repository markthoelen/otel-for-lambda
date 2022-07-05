package org.kinkel.lambda;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
@TestHTTPEndpoint(KinkelLambda.class)
public class LambdaHandlerTest {

//    @Test
//    public void testSimpleLambdaSuccess() throws Exception {
//        // you test your lambdas by invoking on http://localhost:8081
//        // this works in dev mode too
//
//        given()
//                .contentType("application/json")
//                .accept("application/json")
//                .when()
//                .get()
//                .then()
//                .statusCode(200)
//                .body(containsString("!"));
//    }

}
