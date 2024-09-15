package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US13_Page {
    public US13_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='My Operations']")
    public WebElement myOperations;
    @FindBy(xpath = "(//span[normalize-space()='Manage Accounts'])[1]")
    public WebElement manageAccounts;
    @FindBy(xpath = "//span[normalize-space()='Create a new Account']")
    public WebElement createANewAccount;

    @FindBy(xpath = "//input[@id='tp-account-description']")
    public WebElement description;
    @FindBy(xpath = "(//div[contains(text(),'This field is required.')])[1]")
    public WebElement thisFieldIsRequired;
    @FindBy(xpath = "//input[@id='tp-account-balance']")
    public WebElement balance;
    @FindBy(xpath = "//select[@id='tp-account-accountType']")
    public WebElement accountType;
    @FindBy (id = "tp-account-accountType")
    public WebElement accountTypeDropdown;



    @FindBy(xpath = "//option[@value='CHECKING']")
    public WebElement cHECKING;
    @FindBy(xpath = "//option[@value='SAVING']")
    public WebElement sAVING;
    @FindBy(xpath = "//option[@value='CREDIT_CARD']")
    public WebElement cREDITCARD;
    @FindBy(xpath = "//option[@value='INVESTING']")
    public WebElement iNVESTING;

    @FindBy(xpath = "//select[@id='tp-account-accountStatusType']")
    public WebElement accountStatusType;
    @FindBy (id = "tp-account-accountStatusType")
    public WebElement accountStatusDropdown;
    @FindBy(xpath = "//option[@value='ACTIVE']")
    public WebElement aCTIVE;
    @FindBy(xpath = "//option[@value='SUESPENDED']")
    public WebElement sUESPENDED;
    @FindBy(xpath = "//option[@value='CLOSED']")
    public WebElement cLOSED;

    @FindBy(xpath = "//select[@id='tp-account-employee']")
    public WebElement employee;
    @FindBy (id = "tp-account-employee")
    public WebElement employeeDropdown;
    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement save;
    @FindBy(xpath="//span[normalize-space()='employee 2023']") public WebElement employee2023;
    @FindBy(xpath="//span[normalize-space()='Sign out']") public WebElement signOut;
}
