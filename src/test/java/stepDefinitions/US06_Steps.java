package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US06_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US06_Steps {


    @Before
    public void waitUntillElement(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    US06_Page us06_page = new US06_Page();

    @Given("User go to home page")
    public void userGoToHomePage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @And("User click signIn filed")
    public void userClickSignInFiled() {

        us06_page.signInField.click();

    }

    @And("User fill the userName and password field with their informations")
    public void userFillTheUserNameAndPasswordFieldWithTheirInformations() {

        us06_page.userNameField.sendKeys("employee2023");
        us06_page.passwordField.sendKeys("Emplo.Yee23");

    }

    @And("User click the signInbutton")
    public void userClickTheSignInbutton() {

        us06_page.SignInButton.click();
    }

    @And("User click icon that contains their username")
    public void userClickIconThatContainsTheirUsername() {

        us06_page.userNameDropDown.click();
    }

    @And("User click userInfo field")
    public void userClickUserInfoField() {

        us06_page.userInfoField.click();

    }


    @Then("Assert that page contains user informations firstname, lastname, email and language")
    public void assertThatPageContainsUserInformationsFirstnameLastnameEmailAndLanguage() {

        String userSettingsInfos = us06_page.userSettingsForm.getText();

        Assert.assertTrue(userSettingsInfos.contains("First Name"));
        Assert.assertTrue(userSettingsInfos.contains("Last Name"));
        Assert.assertTrue(userSettingsInfos.contains("Email"));
        Assert.assertTrue(userSettingsInfos.contains("Language"));


        String actuallFirstNameOfUser = us06_page.userFirstName.getAttribute("value");
        String expectedFirstnameOfUser = "Employee";

        String actuallLastNameOfUser = us06_page.userLastNAme.getAttribute("value");
        String expectedLastNameOfUser = "Yee";

        String actuallEmailofUser = us06_page.userEmail.getAttribute("value");
        String expectedEmailofUser = "employee2023@gmail.com";

        Assert.assertTrue(expectedFirstnameOfUser.equals(actuallFirstNameOfUser));
        Assert.assertTrue(expectedLastNameOfUser.equals(actuallLastNameOfUser));
        Assert.assertTrue(expectedEmailofUser.equals(actuallEmailofUser));

    }
}
