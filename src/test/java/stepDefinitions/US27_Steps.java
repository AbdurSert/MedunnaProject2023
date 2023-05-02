package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import utilities.ConfigReader;


public class US27_Steps {
    @Given("User delete each state one by one")
    public void userDeleteEachStateOneByOne() {
        RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .and().baseUri("https://www.gmibank.com/api/tp-states/")
                .and().contentType(ContentType.JSON)
                .and().delete("102805")
                .then().assertThat().statusCode(204)
                .extract().response();
    }

    @Then("user verifies the state which is deleted")
    public void userVerifiesTheStateWhichIsDeleted() {
       /* RestAssured.given().auth().oauth2(ConfigReader.getProperty("api_bearer_token"))
                .and().given().baseUri("https://www.gmibank.com/api/tp-states/")
                .and().contentType(ContentType.JSON)
                .and().get("102805")
                .then().assertThat().statusCode(404).extract().response();*/

    }
}
