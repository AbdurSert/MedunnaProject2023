package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007Page {
    public US_007Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/nav[1]/div[1]/ul[1]/li[8]/div[1]/a[1]/span[1]")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameSignIn;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordSignIn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[contains(text(),'user 2023')]")
    public WebElement userAccount;

    @FindBy(xpath = "//span[contains(text(),'User Info')]")
    public WebElement userInfoLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
    public WebElement userEmailField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "//span[contains(text(),'Sign out')]")
    public WebElement signOutButton;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement selectLanguage;






}
