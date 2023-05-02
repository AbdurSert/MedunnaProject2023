package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CreateorEditCustomerPage;
import pages.ManageCustomersPage;
import utilities.Driver;

public class US14_Steps {
    CreateorEditCustomerPage createorEditCustomerPage = new CreateorEditCustomerPage();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();
    Faker faker = new Faker();


    @And("click to create a new customer")
    public void clickToCreateANewCustomer() {
    manageCustomersPage.createANewCustomerBox.click();
    }

    @And("click to firstname box")
    public void clickToFirstnameBox() {
        createorEditCustomerPage.FirstName.click();
    }

    @And("enter a name")
    public void enterAName() {
       String rndmName = faker.random().toString();
       createorEditCustomerPage.FirstName.sendKeys(rndmName+ Keys.TAB);

    }

    @And("enter a lastname")
    public void enterALastname() {
        String rndmLastName = faker.random().toString();
        createorEditCustomerPage.LastName.sendKeys(rndmLastName+Keys.TAB);
    }

    @And("enter a middle initial")
    public void enterAMiddleInitial() {
        String rndmMiddleInitial = faker.random().toString();
        createorEditCustomerPage.MiddleInitial.sendKeys(rndmMiddleInitial+Keys.TAB);
    }

    @And("enter a mail")
    public void enterAMail() {
        String rndmMail = faker.random().toString();
        createorEditCustomerPage.Email.sendKeys(rndmMail+Keys.TAB);
    }

    @And("enter a mobile phone number")
    public void enterAMobilePhoneNumber() {
        createorEditCustomerPage.MobilePhone.sendKeys("543-714-8712"+ Keys.TAB);

    }

    @And("enter a phone number")
    public void enterAPhoneNumber() {
        createorEditCustomerPage.Phone.sendKeys("543-714-8712"+ Keys.TAB);
    }

    @And("enter a zipcode")
    public void enterAZipcode() {
        createorEditCustomerPage.zipCode.sendKeys("1022LA"+ Keys.TAB);
    }

    @And("enter a address")
    public void enterAAddress() {
        createorEditCustomerPage.address.sendKeys("Elzenhagensingel 1623"+Keys.TAB);
    }

    @And("enter a city")
    public void enterACity() {
        createorEditCustomerPage.city.sendKeys("Amsterdam"+Keys.TAB);
    }

    @And("enter a SSN")
    public void enterASSN() {
        createorEditCustomerPage.ssn.sendKeys("786-53-3012"+Keys.TAB);
    }

    @And("enter a date")
    public void enterADate() {
        createorEditCustomerPage.createDate.sendKeys("04/30/2023" +Keys.TAB);
    }

    @And("click to save customer box")
    public void clickToSaveCustomerBox() throws InterruptedException {
        createorEditCustomerPage.saveBox.click();
        Thread.sleep(5000);
    }

    @Then("assert that the date format is MMDDYYYY")
    public void assertThatTheDateFormatIsMMDDYYYY() {
        String actualDateFormat = createorEditCustomerPage.createDate.getAttribute("placeholder");
        String expectedDateFormat = "YYYY-MM-DD HH:mm";


        Assert.assertEquals(actualDateFormat,expectedDateFormat);
    }


    @And("user clicks on the manage accounts")
    public void userClicksOnTheManageAccounts() throws InterruptedException {
        createorEditCustomerPage.manageAccountBox.click();
        Thread.sleep(5000);
    }

    @And("user clicks on one of the created accounts")
    public void userClicksOnOneOfTheCreatedAccounts() {
        createorEditCustomerPage.oneOfTheCreatedAccount.click();
    }

    @Then("assert that you clicked on a created account")
    public void assertThatYouClickedOnACreatedAccount() {
        String expectedUrl = "https://gmibank.com/tp-account/128486";
        String actualUrl = Driver.driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("click to the Zelle Enrolled box")
    public void clickToTheZelleEnrolledBox() {
        createorEditCustomerPage.zelleEnrolled.click();
    }

    @Then("assert that new customer is created")
    public void assertThatNewCustomerIsCreated() {
      Assert.assertTrue(createorEditCustomerPage.savedMessage.isDisplayed());
    }
}
