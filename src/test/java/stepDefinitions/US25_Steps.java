package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class US25_Steps {
    
    Response response;
    @When("User create a country")
    public void userCreateACountry() {
       
        JSONObject reqBody = new JSONObject();

        reqBody.put("name","England");
        reqBody.put("states", JSONObject.NULL );

        System.out.println(reqBody.toString());        

        Response response = given().
                auth().oauth2(ConfigReader.getProperty("token")).
                contentType(ContentType.JSON).
                when().
                body(reqBody.toString()).
                post("https://www.gmibank.com/api/tp-countries");
        response.prettyPrint();

    }

    @Then("Assert that country is created")
    public void assertThatCountryIsCreated() {

        response.
                then().
                assertThat().
                statusCode(201).
                contentType(ContentType.JSON).
                body("id", Matchers.equalTo(185020)).
                body("name", Matchers.equalTo("England")).
                body("states", Matchers.equalTo(null));
    }
}
