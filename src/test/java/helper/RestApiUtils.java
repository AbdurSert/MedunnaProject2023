package helper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;


public class RestApiUtils extends Authentication{

    static ApiCalls apiCalls = new ApiCalls();

    static Response checkUserWithIDGet(int id){
        Response response = null ;

        try {
            response = RestAssured.given().
                    headers("Content-Type", ContentType.JSON).
                    header("Authorization", "Bearer "+generateToken()).
                    when().get(apiCalls.createGetUserApiCall(id));
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
        return response;
    }
}
