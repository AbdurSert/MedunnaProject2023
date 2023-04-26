package stepDefinitions;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import pojos.SetCountries;
import utilities.ConfigReader;

import java.io.ObjectInputFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class US26_Steps {

    Faker faker = new Faker();
    String name = faker.country().name();

    @When("User update a country")
    public void userUpdateACountry() {

        SetCountries setCountries = new SetCountries();

        setCountries.setId(50);
        setCountries.setName(name);
        setCountries.setStates(null);

        RestAssured.baseURI = "https://www.gmibank.com/api/tp-countries";

        Response response = RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .and().contentType(ContentType.JSON).and().
                body(setCountries).put();

        response.prettyPrint();


//Second way to update

        Map<String, Object> updatedCountry = new TreeMap<>();

        updatedCountry.put("id", 50);
        updatedCountry.put("name", "Bosnia");
        updatedCountry.put("states", null);

        Gson gson = new Gson();

        String jsonFormatCountry = gson.toJson(updatedCountry);

        Response gsonUpdatedCountry =  RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .and().contentType(ContentType.JSON).and().
                body(updatedCountry).put();

        gsonUpdatedCountry.prettyPrint();

    }

    @Then("Assert that country is updated")
    public void assertThatCountryIsUpdated() {

        RestAssured.baseURI = "https://www.gmibank.com/api/tp-countries";

        System.out.println(name);

        Response updatedCountry = RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .pathParam("id", "50").get("/{id}").then().assertThat()
                .body(Matchers.anyOf(Matchers.containsString(name), Matchers.containsString("Bosnia")))
                .extract().response();

    }
}
