package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14_Page {

    public US14_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = ("//input[@id='tp-customer-firstName']"))
    public WebElement FirstName;

    @FindBy (xpath = ("//input[@id='tp-customer-lastName']"))
    public WebElement LastName;

    @FindBy (xpath = ("//input[@id='tp-customer-middleInitial']"))
    public WebElement MiddleInitial;

    @FindBy (xpath = ("//input[@id='tp-customer-email']"))
    public WebElement Email;

    @FindBy (xpath = ("//input[@id='tp-customer-mobilePhoneNumber']"))
    public WebElement MobilePhone;

    @FindBy (xpath = ("//input[@id='tp-customer-phoneNumber']"))
    public WebElement Phone;

    @FindBy(xpath = ("//input[@id='tp-customer-zipCode']"))
    public WebElement zipCode;

    @FindBy(xpath = ("//input[@id='tp-customer-address']"))
    public WebElement address;

    @FindBy(xpath = ("//input[@id='tp-customer-city']"))
    public WebElement city;

    @FindBy(xpath = ("//input[@id='tp-customer-ssn']"))
    public WebElement ssn;

    @FindBy(xpath = ("//input[@id='tp-customer-createDate']"))
    public WebElement createDate;


    @FindBy(xpath = ("//button[@id='save-entity']"))
    public WebElement saveBox;

    @FindBy(xpath = ("//input[@id='tp-customer-zelleEnrolled']"))
    public WebElement zelleEnrolled;

    @FindBy(xpath =("//li[@id='entity-menu']//a[2]"))
    public WebElement manageAccountBox;

    @FindBy(xpath = ("//tbody/tr[1]/td[1]/a[1]"))
    public WebElement oneOfTheCreatedAccount;

    @FindBy(xpath = ("//div[@role='alert']"))
    public WebElement savedMessage;
}
