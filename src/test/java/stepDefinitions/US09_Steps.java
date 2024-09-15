package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US04_Page;
import pages.US09_Page;
import utilities.Driver;

public class US09_Steps {

    US04_Page us04_page = new US04_Page();

    US09_Page us09_page = new US09_Page();



    @And("click to the dropdown on my operations")
    public void clickToTheDropdownOnMyOperations() throws InterruptedException {
       us04_page.myOperationsText.click();Thread.sleep(2000);
    }

    @And("click to manage customers")
    public void clickToManageCustomers() throws InterruptedException {
    us04_page.manageCustomers.click();
    Thread.sleep(2000);
    }

    @And("click to the first ID box")
    public void clickToTheFirstIDBox() {
        us09_page.idBox.click();
    }

    @Then("assert if all the info of the customer shines")
    public void assertIfAllTheInfoOfTheCustomerShines() {
        String actualUrl = Driver.driver.getCurrentUrl();
        String expectedUrl = "https://gmibank.com/tp-customer/9595";
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}
