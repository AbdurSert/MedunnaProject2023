package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_005_LoginPage;
import pages.US_010_NewCustomerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_010_NewCustomerPageSD {

    US_005_LoginPage us_005_loginPage = new US_005_LoginPage();
    US_010_NewCustomerPage us_010_newCustomerPage = new US_010_NewCustomerPage();
    @Given("The manager goes to the homepage")
    public void theManagerGoesToTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("The manager clicks the profile menu")
    public void theManagerClicksTheProfileMenu() throws InterruptedException {
        us_005_loginPage.profileMenu.click();
        Driver.wait(3);
    }

    @And("The manager clicks the sign in link")
    public void theManagerClicksTheSignInLink() {
        us_005_loginPage.signInLink.click();

    }

    @And("The manager clicks the username's text box")
    public void theManagerClicksTheUsernameSTextBox() {
        us_005_loginPage.username.click();
    }

    @And("The manager enters valid username for manager")
    public void theManagerEntersValidUsernameForManager() {
        us_005_loginPage.username.sendKeys(ConfigReader.getProperty("manager_username"));
    }

    @And("The manager clicks the password's text box")
    public void theManagerClicksThePasswordSTextBox() {
        us_005_loginPage.newPassword.click();
    }

    @And("The manager enters valid password for manager")
    public void theManagerEntersValidPasswordForManager() {
        us_005_loginPage.newPassword.sendKeys(ConfigReader.getProperty("manager_password"));
    }

    @And("The manager clicks the sign in button")
    public void theManagerClicksTheSignInButton() throws InterruptedException {
        us_005_loginPage.signInLogin.click();
        Driver.wait(5);
    }

    @And("The manager clicks the button of {string} on the headline")
    public void theManagerClicksTheButtonOfOnTheHeadline(String arg0) {
        us_010_newCustomerPage.myOperations.click();
    }

    @And("The manager selects {string}")
    public void theManagerSelects(String arg0) {
        us_010_newCustomerPage.manageCustomers.click();
    }

    @And("The manager clicks {string} button")
    public void theManagerClicksButton(String arg0) {
        us_010_newCustomerPage.createANewCustomer.click();
    }

    @And("The manager clicks on the Address bar")
    public void theManagerClicksOnTheAddressBar() {
        us_010_newCustomerPage.address.submit();
    }

    @Then("The manager sees that text of {string}")
    public void theManagerSeesThatTextOf(String arg0) {
        Assert.assertTrue(us_010_newCustomerPage.thisFieldIsRequiredAddress.isDisplayed());
    }

    @And("The Manager enters the address information as street and number")
    public void theManagerEntersTheAddressInformationAsStreetAndNumber() {
        us_010_newCustomerPage.address.sendKeys("Portland Street Number:2D");
    }

    @Then("The manager verifies that address information should be entered as street and number")
    public void theManagerVerifiesThatAddressInformationShouldBeEnteredAsStreetAndNumber() {
        String actualAddress = us_010_newCustomerPage.address.getAttribute("value");
        System.out.println(actualAddress);
        Assert.assertTrue(actualAddress.contains("Street"));
        Assert.assertTrue(actualAddress.contains("Number"));
    }

    @And("The manager clicks on the City bar")
    public void theManagerClicksOnTheCityBar() {
        us_010_newCustomerPage.city.submit();
    }

    @Then("The manager verifies that the City bar cannot be left blank")
    public void theManagerVerifiesThatTheCityBarCannotBeLeftBlank() {
        Assert.assertTrue(us_010_newCustomerPage.thisFieldIsRequiredCity.isDisplayed());
    }

    @And("The manager clicks on the Country bar")
    public void theManagerClicksOnTheCountryBar() {
        us_010_newCustomerPage.country.click();
    }

    @Then("The manager verifies that the Country bar cannot be left blank")
    public void theManagerVerifiesThatTheCountryBarCannotBeLeftBlank() {
    }

    @And("The manager clicks on the State bar")
    public void theManagerClicksOnTheStateBar() {
        us_010_newCustomerPage.state.click();
    }

    @Then("The manager verifies that the State bar cannot be left blank")
    public void theManagerVerifiesThatTheStateBarCannotBeLeftBlank() {
    }



}
