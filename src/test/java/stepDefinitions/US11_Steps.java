package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US11_Page;

import java.security.Key;
import java.util.Date;

public class US11_Steps {

    US11_Page us11Page = new US11_Page();

    Faker faker = new Faker();

    String date;

    String actuallIdNumber;


    @And("User clicks My Operations field")
    public void userClicksMyOperationsField() {

        us11Page.myOperationsDropDwn.click();

    }

    @And("User clicks Manage Costumers field")
    public void userClicksManageCostumersField() {

        us11Page.manageCostumersField.click();
    }

    @And("User clicks Create New Costumer field")
    public void userClicksCreateNewCostumerField() {

        us11Page.createNewCustomerField.click();

    }

    @And("User pick the date by using Create Date field")
    public void userPickTheDateByUsingCreateDateField() {

        us11Page.createDate.click();

        us11Page.createDate.sendKeys("1" + Keys.TAB);
        us11Page.createDate.sendKeys("5");
        us11Page.createDate.sendKeys("2022");

    }

    @Then("Assert that date is not typed earlier than at the time of creation a customer")
    public void assertThatDateIsNotTypedEarlierThanAtTheTimeOfCreationACustomer() {



    }

    @Then("Assert that  date contains month, day, year, hour and minute")
    public void assertThatDateContainsMonthDayYearHourAndMinute() {

       String actualDateFormat = us11Page.createDate.getAttribute("placeholder");
       String expectedDateFormat = "YYYY-MM-DD HH:mm";


        Assert.assertTrue(actualDateFormat.equals(expectedDateFormat));

    }

    @And("User clicks user id to get informations of them")
    public void userClicksUserIdToGetInformationsOfThem() {


        actuallIdNumber = us11Page.UserIdButton.getText();

        us11Page.UserIdButton.click();

    }

    @Then("Assert that user can choose an account created on manage accounts")
    public void assertThatUserCanChooseAnAccountCreatedOnManageAccounts() {


        String expectedIdnumber = us11Page.UserIdOnUserInfPage.getText();

        System.out.println(actuallIdNumber);
        System.out.println(expectedIdnumber);

        Assert.assertTrue(expectedIdnumber.equals(actuallIdNumber));

    }

    @And("User fills first name field")
    public void userFillsFirstNameField() {

        us11Page.firstNameField.sendKeys("Selim");

    }

    @And("User fills last name field")
    public void userFillsLastNameField() {

        us11Page.lastNameField.sendKeys("Derici");

    }

    @And("User fills middle initial field")
    public void userFillsMiddleInitialField() {

        us11Page.middleInitial.sendKeys("M");
    }


    @And("User fills email field")
    public void userFillsEmailField() {

        us11Page.emailAddressField.sendKeys("selimk@gmail.com");

    }

    @And("User fills mobilephone number field")
    public void userFillsMobilephoneNumberField() {

        us11Page.mobileNumber.sendKeys("543-714-8712");

    }

    @And("User fills phone number fills field")
    public void userFillsPhoneNumberFillsField() {

        us11Page.mobileNumber.sendKeys(Keys.TAB + "543-714-8712");

    }

    @And("User fills zip code field")
    public void userFillsZipCodeField() {

        us11Page.zipCodeField.sendKeys("1022LA");


    }

    @And("User fills adress field")
    public void userFillsAdressField() {

        us11Page.addressField.sendKeys("Elzenhagensingel 1623");

    }

    @And("User fills city field")
    public void userFillsCityField() {

        us11Page.cityField.sendKeys("Amsterdam");

    }

    @And("User fills ssn field")
    public void userFillsSsnField() {

        us11Page.ssnField.sendKeys("786-53-3012");

    }

    @Then("Assert that Zelle Enrolled is optional and it can be save without it")
    public void assertThatZelleEnrolledIsOptionalAndItCanBeSaveWithoutIt() {

      Assert.assertTrue(us11Page.savedMessage.isDisplayed());

    }

}
