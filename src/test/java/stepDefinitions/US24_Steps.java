package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import utilities.ConfigReader;

public class US24_Steps {
    @When("user creates state")
    public void userCreatesState() {
        Response response = RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .baseUri("https://www.gmibank.com/api/tp-states")
                .and().pathParam("id","25370").get("/{id}")
                .then().assertThat().body(Matchers.containsString("Caykara")).extract().response();


        response.prettyPrint();
    }

    @Then("assert that state is created")
    public void assertThatStateIsCreated() {
    }
}
