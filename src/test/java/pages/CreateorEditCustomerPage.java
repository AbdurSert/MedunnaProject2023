package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateorEditCustomerPage {


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


}
