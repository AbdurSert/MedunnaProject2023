package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.Loginpage;
import utilities.Driver;

public class US004stepdefs {

    HomePage homePage = new HomePage();
    Loginpage loginpage = new Loginpage();


    @Given("go to website Gmibank")
    public void goToWebsiteGmibank() {

        WebDriver driver= Driver.getDriver();
        driver.get("https://gmibank.com/");
    }

    @And("click dropdown login")
    public void clickDropdownLogin() {
    homePage.dropdown.click();
    }

    @And("click sign in")
    public void clickSignIn() {
    homePage.signin.click();
    }

    @And("enter a valid username")
    public void enterAValidUsername() {
    loginpage.username.sendKeys("user2023");
    }

    @And("go to password box")
    public void goToPasswordBox() {
    loginpage.password.click();
    }

    @And("enter a valid password")
    public void enterAValidPassword() {
    loginpage.password.sendKeys("User.Name23");
    }

    @And("click to sign in button")
    public void clickToSignInButton() throws InterruptedException {loginpage.signin.click();
        Thread.sleep(5000);
    }

    @Then("see if you are signed in")
    public void seeIfYouAreSignedIn() {
    String signInValidationActual = loginpage.myOperationsText.getText();
    String signInValidationExpected= "My Operations";
        Assert.assertTrue(signInValidationExpected.equals(signInValidationActual));
    }





    @And("click to cancel")
    public void clickToCancel(){loginpage.cancelButton.click();
    }

    @Then("see if it is cancelled")
    public void seeIfItIsCancelled() {
        String actualUrl = Driver.driver.getCurrentUrl();
        String expectedUrl = "https://gmibank.com/";
        Assert.assertEquals(expectedUrl,actualUrl);



    }
}
