package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_005_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US_005_LoginPageSD {

    US_005_LoginPage us_005_loginPage = new US_005_LoginPage();

    @Given("The user goes to the homepage")
    public void theUserGoesToTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("The user clicks the profile menu")
    public void theUserClicksTheProfileMenu() {
        us_005_loginPage.profileMenu.click();
    }

    @And("The user clicks the sign in link")
    public void theUserClicksTheSignInLink() {
        us_005_loginPage.signInLink.click();
    }

    @And("The user clicks the username's text box")
    public void theUserClicksTheUsernameSTextBox() {
        us_005_loginPage.username.click();

    }

    @And("The user enters invalid username")
    public void theUserEntersInvalidUsername() {
        us_005_loginPage.username.sendKeys("user202");
    }

    @And("The user clicks the password's text box")
    public void theUserClicksThePasswordSTextBox() {
        us_005_loginPage.newPassword.click();
    }

    @And("The user enters valid password for user")
    public void theUserEntersValidPasswordForUser() {
        us_005_loginPage.newPassword.sendKeys("User.Name23");
    }

    @And("The user clicks the sign in button")
    public void theUserClicksTheSignInButton() throws InterruptedException {
        us_005_loginPage.signInLogin.click();
        Driver.wait(5);

    }

    @Then("The user sees the text of the error message")
    public void theUserSeesTheTextOfTheErrorMessage() {

        Assert.assertTrue(us_005_loginPage.errorMessage.isDisplayed());

    }

    @And("The user enters valid username for user")
    public void theUserEntersValidUsernameForUser() {
        us_005_loginPage.username.sendKeys(ConfigReader.getProperty("user_username"));
    }

    @And("The user enters invalid password")
    public void theUserEntersInvalidPassword() {
        us_005_loginPage.newPassword.sendKeys("User.Name2");
    }

    @When("The user clicks the labelfirst of {string}")
    public void theUserClicksTheLabelOf(String arg0) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        js.executeScript("arguments[0].click();", us_005_loginPage.didYouForgetYourPassword);
    }

    @Then("The user sees the text of {string}")
    public void theUserSeesTheTextOf(String arg0) throws InterruptedException {

        String actualText = us_005_loginPage.resetYourPassword.getText();
        String expectedText = "Reset your password";
        Assert.assertEquals(expectedText,actualText);

        //Assert.assertTrue(us_005_loginPage.resetYourPassword.isDisplayed());

    }

    @When("The user clicks the labelsecond of {string}")
    public void theUserClicksTheLabelsecondOf(String arg0) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        js.executeScript("arguments[0].click();", us_005_loginPage.registerANewAccount);

        //Driver.driver.navigate().to("https://www.gmibank.com/account/register");
        //WebDriverWait wait = new WebDriverWait(Driver.driver,Duration.ofSeconds(20));
        //Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //String text = alert.getText();
        //alert.accept();
    }

    @Then("The user sees redirected to Registration page.")
    public void theUserSeesRedirectedToRegistrationPage() throws InterruptedException {

        String actualText = us_005_loginPage.registrationPage.getText();
        String expectedText = "Registration";
        Assert.assertEquals(expectedText,actualText);

        //Assert.assertTrue(us_005_loginPage.registrationPage.isDisplayed());
    }

}
