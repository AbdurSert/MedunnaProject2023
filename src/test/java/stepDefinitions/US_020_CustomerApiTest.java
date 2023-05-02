package stepDefinitions;


import helper.ApiCalls;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.PrettyPrint;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_020_CustomerApiTest {

    Response response;

    // public static String baseUrlPathParams;
    // public static String createGetCustomer(int id){return baseUrlPathParams + id ;}

    /*public static RequestSpecification spec = spec = new RequestSpecBuilder()
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

     */

    /*@Given("API User sets required path params {string}")
    public void apiUserSetsRequiredPathParams(String arg0) {

        baseUrlPathParams = ConfigReader.getProperty("baseurl+pathParams");

    }

    @When("API user sends requests and gets response")
    public void apiUserSendsRequestsAndGetsResponse() {

        //Response response = given().when().get(ConfigReader.getProperty(""));


            Response response = RestAssured.given().
                        headers("Content-Type", ContentType.JSON).
                        header("Authorization", "Bearer "+ConfigReader.getProperty("token")).statusCode(200).
                        when().get(baseUrlPathParams);
        response.prettyPrint();

    }
     */


    @When("Read all customers you created")
    public void readAllCustomersYouCreated() {
        response = RestAssured.given().auth().oauth2(ConfigReader.getProperty("token"))
                .and().baseUri("https://www.gmibank.com/api/tp-customers")
                .and().pathParam("id", "114351").get("/{id}")
                .then()
                .assertThat()
                //.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("account-schema.json"))
                .and().assertThat().statusCode(200).and().contentType(Matchers.is("application/json"))
                .and().body(Matchers.containsString("Della"))
                .and().statusCode(Matchers.equalTo(200))
                .extract().response();
        response.prettyPrint();
    }

    @Then("Validate them from your data set")
    public void validateThemFromYourDataSet() {
        String actualOutput =  response.body().asString();

        System.out.println(actualOutput);

        Assert.assertTrue(actualOutput.contains("Della"));

        Map<String, Object> listofAccounts;
        listofAccounts = response.as(Map.class);

        System.out.println("De-Serialization Data Type : " +listofAccounts);
        Assert.assertEquals(listofAccounts.get("id"), 114351);
    }
}









