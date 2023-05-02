package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US05_Page {

    public US05_Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement profileMenu;

    @FindBy(xpath="(//a[@id='login-item'])[1]")
    public WebElement signInLink;

    @FindBy(xpath="//input[@id='username']")
    public WebElement username;

    @FindBy(xpath="//input[@id='password']")
    public WebElement newPassword;

    @FindBy(xpath="//span[contains(text(),'Did you forget your password?')]")
    public WebElement didYouForgetYourPassword;

    @FindBy(xpath="//span[contains(text(),'Register a new account')]")
    public WebElement registerANewAccount;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInLogin;

    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement cancel;

    @FindBy(xpath="(//div[@class='alert alert-danger fade show'])[1]")
    public WebElement errorMessage;

    @FindBy(xpath="//span[contains(text(),'Reset your password')]")
    public WebElement resetYourPassword;

    @FindBy(xpath="//*[@id=\"register-title\"]/span")
    public WebElement registrationPage;







}
