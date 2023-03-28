package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class MyStepdefs {
    @Given("adrese gider")
    public void adreseGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("gelir adrese")
    public void gelirAdrese() {
    }

    @Then("kapatir suteyi")
    public void kapatirSuteyi() {
    }
}
