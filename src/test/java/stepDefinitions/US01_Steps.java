package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US01_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US01_Steps {

    @Before
    public void waitUntillElement(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    US01_Page US01Page = new US01_Page();
    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    String expectedAddress;
    String expectedSsnNumber;

    String phoneNumber;

    String userName;

    String emailAddress;


    @Given("user open the homepage")
    public void userOpenTheHomepage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("User click register_signIn icon")
    public void userClickRegister_signInIcon() {

        US01Page.register_SignInButton.click();

    }

    @And("User click register button")
    public void userClickRegisterButton() {

        US01Page.registerButton.click();

    }

    @And("User fill the blank with valid ssn number")
    public void userFillTheBlankWithValidSsnNumber() {

        String ssnNumber = faker.idNumber().validSvSeSsn().substring(0, 10);

        action.sendKeys(US01Page.ssnBlank, ssnNumber).perform();

        expectedSsnNumber = ssnNumber;

    }

    @Then("Assert that is been filled valid ssn number")
    public void assertThatIsBeenFilledValidSsnNumber() {

        String actualSsnNumber = US01Page.ssnBlank.getAttribute("value");

        Assert.assertTrue(actualSsnNumber.replace("-", "")
                .equals(expectedSsnNumber.replace("-", "").replace("+", "")));


    }

    @And("User fill the blank that belongs firstName with chars without blank")
    public void userFillTheBlankThatBelongsFirstNameWithCharsWithoutBlank() {

            String firstName = faker.name().firstName();

            action.sendKeys(US01Page.firstName, firstName).perform();

    }

    @Then("Assert that firstName has no blanks and contains chars")
    public void assertThatFirstNameHasNoBlanksAndContainsChars() {

    String actualFirstName = US01Page.firstName.getText();
        System.out.println(actualFirstName);

        for(int i = 0; i<actualFirstName.length()-1; i++ ) {

            if (actualFirstName.charAt(i) >= 0 && actualFirstName.charAt(i) <= 127) {

                Assert.assertTrue(true);

            } else {

                Assert.assertTrue(false);
            }

        }

        if(actualFirstName.contains(" ")){

            Assert.assertTrue(false);


        }
        else {

            Assert.assertTrue(true);

        }

    }

    @And("User click lastname field")
    public void userClickLastnameField() {

        US01Page.lastName.click();

    }

    @And("User click adress field")
    public void userClickAdressField() {

        US01Page.adressField.click();

    }

    @Then("Assert that lastname is required field")
    public void assertThatLastnameIsRequiredFieldAndContainsChars() {

        String actualLastNameErrorMessage = "Please enter your last name.";
        String expectedLastNameErrorMEssage = US01Page.lastNameErrorMessage.getText();

        Assert.assertTrue(actualLastNameErrorMessage.equals(expectedLastNameErrorMEssage));


    }

    @And("User fill the lastname field")
    public void userFillTheLastnameField() {

        String lastName = faker.name().lastName();

        action.sendKeys(US01Page.lastName, lastName).perform();

    }

    @Then("Assert that lastname is valid and contains chars")
    public void assertThatLastnameIsValidAndContainsChars() {


    String actualLastName = US01Page.lastName.getText();

        System.out.println(actualLastName);

    for(int i = 0; i<actualLastName.length()-1; i++ ){

        if(actualLastName.charAt(i)>= 0 & actualLastName.charAt(i) <= 127 ){

            Assert.assertTrue(true);

        }

        else{

            Assert.assertTrue(false);
        }


    }

    }

    @And("User fill the address field")
    public void userFillTheAddressField() {

        String address = faker.address().fullAddress();

        action.sendKeys(US01Page.adressField, address ).perform();

        expectedAddress = address;

    }

    @Then("Assert that address field contains chars and digits with zip code")
    public void assertThatAddressFieldContainsCharsAndDigitsWithZipCode() {

    String actualaddress = US01Page.adressField.getAttribute("value");

    Assert.assertTrue(actualaddress.equals(expectedAddress));

    }

    @And("User fill the mobilephone field as {int} digit long")
    public void userFillTheMobilephoneFieldAsDigitLong(int arg0) {

        phoneNumber = faker.phoneNumber().phoneNumber();

        action.sendKeys(US01Page.mobilePhoneField, phoneNumber).perform();

    }

    @Then("Assert that blank filled with {int} digit long mobilephone number")
    public void assertThatBlankFilledWithDigitLongMobilephoneNumber(int arg0) {

        String actualphoneNumber = US01Page.mobilePhoneField.getAttribute("value")
                .replace("-", "");

        String expectedPhoneNumber= phoneNumber.replace(".", "")
                .replace("-", "").substring(0, 10);


        System.out.println(actualphoneNumber);
        System.out.println(expectedPhoneNumber);

        Assert.assertTrue(actualphoneNumber.equals(expectedPhoneNumber));

    }


    @And("User fill the username field by using chars and digits")
    public void userFillTheUsernameFieldByUsingCharsAndDigits() {

        userName = faker.name().username();

        action.sendKeys(US01Page.usernameField, userName).perform();

    }

    @Then("Assert that blank filled with username that contains any chars and digits")
    public void assertThatBlankFilledWithUsernameThatContainsAnyCharsAndDigits() {

        String actualUserName = US01Page.usernameField.getAttribute("value");
        String expectedUserName = userName;

        Assert.assertTrue(actualUserName.equals(expectedUserName));

    }

    @And("User fill the e-mail field")
    public void userFillTheEMailField() {

        emailAddress = faker.internet().emailAddress();

        action.sendKeys(US01Page.emailField, emailAddress).perform();

    }

    @Then("Assert that email contains {string} sign and {string} extension")
    public void assertThatEmailContainsSignAndExtension(String arg0, String arg1) {

        String actualEmailAdress = US01Page.emailField.getAttribute("value");

        String expectedEmailAdress = emailAddress;

        Assert.assertTrue(actualEmailAdress.equals(expectedEmailAdress));

    }
}
