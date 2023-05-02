package pages;

import lombok.experimental.FieldDefaults;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US11_Page {

    public US11_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")

    public WebElement myOperationsDropDwn;

    @FindBy (xpath = "(//span[normalize-space()='Manage Customers'])[1]")

    public WebElement manageCostumersField;

    @FindBy (id = "jh-create-entity")

    public WebElement createNewCustomerField;

    @FindBy (id = "tp-customer-createDate")

    public  WebElement createDate;

    @FindBy (xpath = "(//a[normalize-space()='9595'])[1]")

    public WebElement UserIdButton;

    @FindBy (xpath = "(//b[normalize-space()='9595'])[1]")

    public WebElement UserIdOnUserInfPage;

    @FindBy (xpath = "(//input[@id='tp-customer-firstName'])[1]")

    public WebElement firstNameField;

    @FindBy (xpath = "//input[@id='tp-customer-lastName']")

    public WebElement lastNameField;

    @FindBy (xpath = "//input[@id='tp-customer-middleInitial']")

    public WebElement middleInitial;

    @FindBy (xpath = "//input[@id='tp-customer-email']")

    public WebElement emailAddressField;

    @FindBy (xpath = "//input[@id='tp-customer-mobilePhoneNumber']")

    public WebElement mobileNumber;

    @FindBy (xpath = "//input[@id='tp-customer-zipCode']")

    public WebElement zipCodeField;

    @FindBy (xpath = "//input[@id='tp-customer-address']")

    public WebElement addressField;

    @FindBy (xpath = "//input[@id='tp-customer-city']")

    public WebElement cityField;

    @FindBy (xpath = "//input[@id='tp-customer-ssn']")

    public WebElement ssnField;

    @FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")

    public WebElement savedMessage;







}
