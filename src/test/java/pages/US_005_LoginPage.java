package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_005_LoginPage {

    public US_005_LoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//li[@id='account-menu']//a[@class='dropdown-toggle nav-link']")
    public WebElement profileMenu;

    @FindBy(xpath="(//a[@id='login-item'])[1]")
    public WebElement signInLink;

    @FindBy(xpath="(//input[@id='username'])[1]")
    public WebElement username;

    @FindBy(xpath="//input[@id='password']")
    public WebElement newPassword;

    @FindBy(xpath="(//div[@role='alert'])[1]")
    public WebElement didYouForgetYourPassword;

    @FindBy(xpath="(//div[@role='alert'])[2]")
    public WebElement youDontHaveAnAccountYet;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInLogin;

    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement cancel;

    @FindBy(xpath="(//div[@class='alert alert-danger fade show'])[1]")
    public WebElement errorMessage;


}
