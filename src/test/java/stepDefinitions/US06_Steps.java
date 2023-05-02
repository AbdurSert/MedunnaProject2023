package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.AfterStep;
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


    Faker faker = new Faker();

    US06_Page us06_page = new US06_Page();

    String firstName;

    String lastName;

    String emailaddress;


    @Given("User goes to home page")
    public void userGoesToHomePage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @And("User click signIn filed")
    public void userClickSignInFiled() {

        us06_page.signInField.click();

    }

    @And("User fill the userName and password field with their informations")
    public void userFillTheUserNameAndPasswordFieldWithTheirInformations() {

        us06_page.userNameField.sendKeys("manager2023");
        us06_page.passwordField.sendKeys("Mana.Ger23");

    }

    @And("User click the signInbutton")
    public void userClickTheSignInbutton() throws InterruptedException {

        us06_page.SignInButton.click();

        Thread.sleep(1000);
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

    }

    @Then("Assert that there are two languages available Turkish and English")
    public void assertThatThereAreTwoLanguagesAvailableTurkishAndEnglish() {

        List<String> actuallAvailableLanguages = new ArrayList<>();

        actuallAvailableLanguages.add(us06_page.languageDropDownTr.getText());
        actuallAvailableLanguages.add(us06_page.languageDropDownEn.getText());

        List<String> expectedAvaliableLanguages = new ArrayList<>();

        expectedAvaliableLanguages.add("Türkçe");
        expectedAvaliableLanguages.add("English");

        Assert.assertTrue(actuallAvailableLanguages.equals(expectedAvaliableLanguages));

        Driver.closeDriver();

    }


    @And("User changes their first name")
    public void userChangesTheirFirstName() {

        firstName = faker.name().firstName();

        us06_page.userFirstName.clear();

        us06_page.userFirstName.sendKeys(firstName);

    }

    @And("User click save button")
    public void userClickSaveButton() throws InterruptedException {

        us06_page.saveButton.click();

        Thread.sleep(5000);

    }

    @Then("Assert that firstname is changed")
    public void assertThatFirstnameIsChanged() {

        String actualUsernameModified = us06_page.userNameDropDown.getText();

        String expectedUsernameModified = firstName;

        Assert.assertTrue(actualUsernameModified.substring(0, actualUsernameModified.indexOf(" "))
                .equals(expectedUsernameModified));


    }

    @And("User changes their last name")
    public void userChangesTheirLastName() {

        lastName = faker.name().lastName();

        us06_page.userLastNAme.clear();
        us06_page.userLastNAme.sendKeys(lastName);

    }

    @Then("Assert that lastname is changed")
    public void assertThatLastnameIsChanged() {

        String actuallLastNameModified = us06_page.userNameDropDown.getText();

        String expectedLastNameModified = lastName;

        Assert.assertTrue(actuallLastNameModified
                .substring(actuallLastNameModified.indexOf(" ") + 1, actuallLastNameModified.length()).equals(expectedLastNameModified));

    }

    @And("User changes email address")
    public void userChangesEmailAddress() {

        emailaddress = faker.internet().emailAddress();

        us06_page.userEmail.clear();
        us06_page.userEmail.sendKeys(emailaddress);

    }

    @Then("Assert that email is changed with @ sign and . extension")
    public void assertThatEmailIsChangedWithSignAndExtension() {

        String actuallEmailAddressModified = us06_page.userEmail.getAttribute("value");

        String expectedEmailAddressModified = emailaddress;

        Assert.assertTrue(actuallEmailAddressModified.equals(expectedEmailAddressModified));

    }
}
