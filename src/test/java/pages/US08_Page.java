package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08_Page {
    public US08_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath="//span[normalize-space()='Sign in']") public WebElement mainSignIn;
    @FindBy(xpath="//input[@id='username']") public WebElement LoginUsername;
    @FindBy(xpath="//input[@id='password']") public WebElement LoginPassword;
    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Sign in')]") public WebElement signInButton;
    @FindBy(xpath="//span[normalize-space()='Admin Strator']") public WebElement adminStrator;
    @FindBy(xpath="//span[normalize-space()='Password']") public WebElement passwordButton;
    @FindBy(xpath="//input[@id='currentPassword']") public WebElement currentPassword;
    @FindBy(xpath="//input[@id='newPassword']") public WebElement newPassword;

    @FindBy(xpath="//input[@id='confirmPassword']") public WebElement newPasswordConfirmation;
    @FindBy(xpath="//span[normalize-space()='Save']") public WebElement save;

    @FindBy(xpath="//div[contains(text(),'New password should be different from the current ')]") public WebElement newPasswordShouldBeDiffere;
    @FindBy(xpath="//form[@id='password-form']//li[1]") public WebElement strengthBar;
    @FindBy(xpath="//form[@id='password-form']//li[2]") public WebElement strengthBar2;
    @FindBy(xpath="//form[@id='password-form']//li[3]") public WebElement strengthBar3;
    @FindBy(xpath="//form[@id='password-form']//li[4]") public WebElement strengthBar4;
    @FindBy(xpath="//form[@id='password-form']//li[5]") public WebElement strengthBar5;
    @FindBy(xpath="//span[normalize-space()='Sign out']") public WebElement signOut;

}
