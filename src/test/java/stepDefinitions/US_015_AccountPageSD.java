package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_015_AccountPage;

public class US_015_AccountPageSD {

    US_015_AccountPage us_015_accountPage = new US_015_AccountPage();

    @And("The manager selects Manage Accounts")
    public void theManagerSelectsManageAccounts() {
        us_015_accountPage.manageAccounts.click();
    }

    @Then("The user sees all account types and balance populated")
    public void theUserSeesAllAccountTypesAndBalancePopulated() {
    }

    @And("The user clicks the View button")
    public void theUserClicksTheViewButton() {
        us_015_accountPage.view.click();
    }

    @Then("The user can view transaction")
    public void theUserCanViewTransaction() {
        Assert.assertTrue(us_015_accountPage.accountTransaction.isDisplayed());

    }



}
