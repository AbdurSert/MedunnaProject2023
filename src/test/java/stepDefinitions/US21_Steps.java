package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.Map;

public class US21_Steps {

    Response response;

    @When("Read all countries you created")
    public void readAllCountriesYouCreated() {

        response = RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .and().baseUri("https://www.gmibank.com/api/tp-countries").and()
                .pathParam("id", "10").get("/{id}").then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("country-schema.json"))
                .and().assertThat().statusCode(200).and().contentType(Matchers.is("application/json"))
                .extract().response();

    }

    @Then("Validate them from your data set")
    public void validateThemFromYourDataSet() {

        String actualOutput =  response.body().asString();

        System.out.println(actualOutput);

        Assert.assertTrue(actualOutput.contains("japonya"));

    }
}
