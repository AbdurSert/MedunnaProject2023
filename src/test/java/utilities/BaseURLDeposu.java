package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BaseURLDeposu {

    protected RequestSpecification specJsonPlace;

    @ Before
    public void setUp(){
        specJsonPlace = new RequestSpecBuilder().setBaseUri("https://gmibank.com/").build();
    }

    @Test
    public void test01(){
        specJsonPlace.pathParams("pp1","api","pp2","countries");

        Response response = given().spec(specJsonPlace).when().get("{pp1}/{pp2}");
    }


}
