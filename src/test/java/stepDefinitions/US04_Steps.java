package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US04_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US04_Steps {
    US04_Page us04Page = new US04_Page();

    @Given("go to website Gmibank")
    public void goToWebsiteGmibank() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(5000);
    }

    @And("click dropdown login")
    public void clickDropdownLogin() {us04Page.dropdown.click();
    }
    @And("click sign in")
    public void clickSignIn() {us04Page.signin.click();
    }
    @And("enter a valid username")
    public void enterAValidUsername() {
        us04Page.username.sendKeys("user2023");
    }

    @And("go to password box")
    public void goToPasswordBox() {
        us04Page.password.click();
    }

    @And("enter a valid password")
    public void enterAValidPassword() {
        us04Page.password.sendKeys("User.Name23");
    }

    @And("click to sign in button")
    public void clickToSignInButton() throws InterruptedException {
        us04Page.secondSignIn.click();
        Thread.sleep(5000);
    }

    @Then("see if you are signed in")
    public void seeIfYouAreSignedIn() {
        String signInValidationActual = us04Page.myOperationsText.getText();
        String signInValidationExpected= "My Operations";
        Assert.assertTrue(signInValidationExpected.equals(signInValidationActual));
    }
    @And("click to cancel")
    public void clickToCancel(){
        us04Page.cancelButton.click();
    }

    @Then("see if it is cancelled")
    public void seeIfItIsCancelled() {
        String actualUrl = Driver.driver.getCurrentUrl();
        String expectedUrl = "https://gmibank.com/";
        Assert.assertEquals(expectedUrl, actualUrl);

    }
}
