package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US002_Pages {

    public US002_Pages() {
        PageFactory.initElements(Driver.getDriver(),  this);}

    //RegisterPage - US_002
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/nav/div/ul/li[8]")
    public WebElement dropdownClick;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[2]/nav/div/ul/li[8]/div/a[2]")
    public WebElement register;


    @FindBy(xpath = "(//input[@id='ssn'])[1]")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//button[@id='register-submit']//span[contains(text(),'Register')]")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@id='app-view-container']//span[1]//span[1]")
    public WebElement message;


}
