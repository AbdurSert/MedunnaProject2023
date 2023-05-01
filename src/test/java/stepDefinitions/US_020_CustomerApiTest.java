package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;

public class US_020_CustomerApiTest {

    public static RequestSpecification spec = spec = new RequestSpecBuilder()
            .setBaseUri(ConfigReader.getProperty("base_url"))
            .build();
    public static String fullPath = null;
    public static Response response;


    @Given("API User sets required path params {string}")
    public void apiUserSetsRequiredPathParams(String rawPaths) {
        String[] paths = rawPaths.split(",");
        StringBuilder tempPath = new StringBuilder("{");
        for (int i = 0; i < paths.length; i++) {
            String key = "get" + i;
            spec.pathParam(key, paths[i].trim());
            tempPath.append(key + "}/{");
        }
        tempPath.deleteCharAt(tempPath.lastIndexOf("{"));
        tempPath.deleteCharAt(tempPath.lastIndexOf("/"));
        fullPath = tempPath.toString();
    }

    @When("API user sends requests and gets response")
    public void apiUserSendsRequestsAndGetsResponse() {
        response = given()
                .headers("Authorization", "Bearer " + ConfigReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .spec(spec)
                .when()
                //.body(HooksAPI.dataCredentials)
                .get(fullPath);


    }

    @Then("API user verify that status code is {int}")
    public void apiUserVerifyThatStatusCodeIs(int statusCode) {
        response.then().assertThat()
                .statusCode(statusCode)
                .contentType(ContentType.JSON);
        response.prettyPrint();
        response.prettyPrint();
    }
}





