package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.Loginpage;
import pages.ManageCustomersPage;
import utilities.Driver;

public class US09_Steps {

    HomePage homePage = new HomePage();
    Loginpage loginpage = new Loginpage();
    ManageCustomersPage manageCustomersPage= new ManageCustomersPage();



    @And("click to the dropdown on my operations")
    public void clickToTheDropdownOnMyOperations() throws InterruptedException {
       loginpage.myOperationsText.click();Thread.sleep(2000);
    }

    @And("click to manage customers")
    public void clickToManageCustomers() throws InterruptedException {
    loginpage.manageCustomers.click();
    Thread.sleep(2000);
    }

    @And("click to the first ID box")
    public void clickToTheFirstIDBox() {
        manageCustomersPage.idBox.click();
    }

    @Then("assert if all the info of the customer shines")
    public void assertIfAllTheInfoOfTheCustomerShines() {
        String actualUrl = Driver.driver.getCurrentUrl();
        String expectedUrl = "https://gmibank.com/tp-customer/9595";
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}
