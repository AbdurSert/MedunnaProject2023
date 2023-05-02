package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US23_Steps {

        Response response;

    public static void main(String[] args) {
        tokenGenerate();
        System.out.println(tokenGenerate());
    }
    public static String tokenGenerate(){

        String url = "https://gmibank.com/api/authenticate";
        Map<String, String> expectedData = new HashMap();
        expectedData.put("username","admin2023");
        expectedData.put("password","Admin.Strator23");

        Response response = given().contentType(ContentType.JSON).body(expectedData).when().post(url);

        return response.path("id_token");

    }

        @When("Sistem butun kullanici bilgilerini okur")
        public void sistemButunKullaniciBilgileriniOkur() {
            response = RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                    .and().baseUri("https://www.gmibank.com/api/tp-account-registrations")
                    .and().pathParam("id", "2230").get("/{id}")
                    .then()
                    .assertThat()
                   .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("account-schema.json"))
                    .and().assertThat().statusCode(200).and().contentType(Matchers.is("application/json"))
                    .and().body(Matchers.containsString("Aziz"))
                    .and().statusCode(Matchers.equalTo(200))
                    .extract().response();
            response.prettyPrint();

        }

        @Then("data seti dogrular")
        public void dataSetiDogrular() {
            String actualOutput =  response.body().asString();

            System.out.println(actualOutput);

            Assert.assertTrue(actualOutput.contains("Aziz"));

            Map<String, Object> listofAccounts;
            listofAccounts = response.as(Map.class);

            System.out.println("De-Serialization Data Type : " +listofAccounts);
            Assert.assertEquals(listofAccounts.get("id"), 2230);
        }
    }

