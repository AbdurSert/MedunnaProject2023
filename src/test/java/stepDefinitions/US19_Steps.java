package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US04_Page;
import pages.US19_Page;
import utilities.Driver;

public class US19_Steps {

    US19_Page us019Pages = new US19_Page();
    US04_Page US04Page = new US04_Page();
    Faker faker = new Faker();

    String accountTypes;
    @And("enter manager username")
    public void enterManagerUsername() {
        US04Page.username.sendKeys("manager2023");
    }

    @And("enter manager password")
    public void enterManagerPassword(){
        US04Page.password.sendKeys("Mana.Ger23");

    }

    @And("click to dropdown on my operations")
    public void clickToDropdownOnMyOperations() throws InterruptedException {
    US04Page.myOperationsText.click();
    }

    @And("click to manage accounts")
    public void clickToManageAccounts() {
        us019Pages.manageAccounts.click();
    }

    @And("click to create a new account")
    public void clickToCreateANewAccount() {
        us019Pages.createNewAccount.click();
    }

    @And("click to description")
    public void clickToDescription() {
       us019Pages.descriptionBox.click();
    }

    @And("type in description")
    public void typeInDescription() {
        String randomDescription = faker.random().toString();
        us019Pages.descriptionBox.sendKeys(randomDescription);
    }

    @And("click to balance")
    public void clickToBalance() {
        us019Pages.balanceBox.click();
    }

    @And("type in balance")
    public void typeInBalance() {
        int randomBalance =faker.random().nextInt(0,10000000);
        String balanceOfString = String.valueOf(randomBalance);
        us019Pages.balanceBox.sendKeys(balanceOfString);

    }

    @And("click to save box")
    public void clickToSaveBox() {
        us019Pages.saveBox.click();
    }

    @Then("verify that account is created successfully")
    public void verifyThatAccountIsCreatedSuccessfully() {
        String actualUrl = Driver.driver.getCurrentUrl();
        String expectedUrl = "https://gmibank.com/tp-account?page=1&sort=id,asc";
        Assert.assertEquals(expectedUrl,actualUrl);
    }


    @And("click to account type box")
    public void clickToAccountTypeBox() {
         accountTypes = us019Pages.accountTypeBox.getText();
    }

    @Then("verify that all four options shines")
    public void verifyThatAllFourOptionsShines() {
        Assert.assertTrue(accountTypes.contains("CHECKING"));
        Assert.assertTrue(accountTypes.contains("SAVING"));
        Assert.assertTrue(accountTypes.contains("CREDIT_CARD"));
        Assert.assertTrue(accountTypes.contains("INVESTING"));

    }

    @And("click to account status type bar")
    public void clickToAccountStatusTypeBar() {
    }

    @And("select one of the dropdown options")
    public void selectOneOfTheDropdownOptions() {
    }
}
