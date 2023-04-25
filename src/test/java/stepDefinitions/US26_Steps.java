package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class US26_Steps {
    @When("User update a country")
    public void userUpdateACountry() {

    Map<String, Object> updateCountry = new TreeMap<>();

    updateCountry.put("id", 50);
    updateCountry.put("name", "fethi");

    Gson gson = new Gson();

    String serializedCountry = gson.toJson(updateCountry);

        System.out.println(serializedCountry);

        Response response = RestAssured.given()
                .baseUri("https://www.gmibank.com/api/tp-countries")
                .body(serializedCountry)
                .put()
                .then()
                .assertThat()
                .body(Matchers.containsString("fethi"))
                .extract()
                .response();

        response.prettyPrint();

    }

    @Then("Assert that country is updated")
    public void assertThatCountryIsUpdated() {
    }
}
