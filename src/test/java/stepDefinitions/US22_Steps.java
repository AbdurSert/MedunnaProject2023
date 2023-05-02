package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.StatesPojoFiles;
import utilities.ConfigReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class US022_Steps {

    Response response;
    List<StatesPojoFiles> states;
    ObjectMapper objectMapper = new ObjectMapper();
    @Given("Read all states you created")
    public void readAllStatesYouCreated() {
        response = RestAssured.given().auth().oauth2(ConfigReader.getProperty("api_bearer_token"))
                .and().baseUri("https://www.gmibank.com/api/")
                .and().contentType(ContentType.JSON)
                .and().get("tp-states").then().extract().response();


    }

    @Then("Validate them from data set")
    public void validateThemFromDataSet() throws IOException {

        String statesPath = "src/test/resources/AllStates.txt";
        FileReader file = new FileReader(statesPath);
        BufferedReader bufferedReader = new BufferedReader(file);
        String expectedResponse = bufferedReader.readLine();
        List<String> expectedStates =new ArrayList<>();
        expectedStates.add(expectedResponse);

        states = Arrays.asList(objectMapper.readValue(response.asString(), StatesPojoFiles[].class));
        List<String> actualStates = states.stream().map(StatesPojoFiles::getName).toList();
        String names = actualStates.toString();

        Map<String, Object> actualStatesNames = new TreeMap<>();
        actualStatesNames.put("name", names);
        System.out.println(actualStatesNames);

        Assert.assertEquals(actualStatesNames.size(), expectedStates.size());


    }

    @Then("Validate them one by one")
    public void validateThemOneByOne() throws JsonProcessingException {
        String actualResponse = response.body().asPrettyString();
        System.out.println(actualResponse);
        Assert.assertTrue(actualResponse.contains("Manisa"));


        //OR

        states = Arrays.asList(objectMapper.readValue(response.asString(), StatesPojoFiles[].class));

        List<Integer> statesID = states.stream().map(StatesPojoFiles::getId).toList();
        List<String> statesName= states.stream().map(StatesPojoFiles::getName).toList();

        Assert.assertTrue("Does not contain expected ID", statesID.contains(174663));
        Assert.assertTrue("Does not contain expected name", statesName.contains("Samsun"));

    }
}
