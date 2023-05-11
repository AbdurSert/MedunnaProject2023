package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import utilities.ConfigReader;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class US24_Steps {
    Response response;

    @When("user creates state")
    public void userCreatesState() {
        //post countries
        Map<String, Object> states = new TreeMap<>();
        states.put("name", "HANNOVER");
        states.put("states", null);

        Gson gson = new Gson();
        String newState = gson.toJson(states);
        System.out.println(newState);

        response =RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .and().contentType(ContentType.JSON)
                .and().baseUri("https://www.gmibank.com/api/").pathParam("post", "tp-countries")
                .body(newState).post("{post}").then().assertThat().statusCode(201).extract().response();

        response.prettyPrint();

    }

    @Then("assert that state is created")
    public void assertThatStateIsCreated() {

    }
}
