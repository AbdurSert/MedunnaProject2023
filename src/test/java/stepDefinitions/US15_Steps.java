package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US15_Page;

public class US15_Steps {

    US15_Page us_015_accountPage = new US15_Page();

    @And("The manager selects Manage Accounts")
    public void theManagerSelectsManageAccounts() {
        us_015_accountPage.manageAccounts.click();
    }

    @Then("The user sees all account types and balance populated")
    public void theUserSeesAllAccountTypesAndBalancePopulated() {

        Assert.assertTrue(us_015_accountPage.Transactions.isDisplayed());
    }

    @And("The user clicks the View button")
    public void theUserClicksTheViewButton() {
        us_015_accountPage.view.click();
    }

    @Then("The user can view transaction")
    public void theUserCanViewTransaction() {
        Assert.assertTrue(us_015_accountPage.accountTransaction.isDisplayed());

    }


    @And("The user clicks the button of {string} on the headline")
    public void theUserClicksTheButtonOfOnTheHeadline(String arg0) {
        us_015_accountPage.myOperations.click();
    }

    @And("The user selects Manage Accounts")
    public void theUserSelectsManageAccounts() {
        us_015_accountPage.manageAccounts.click();
    }
}
