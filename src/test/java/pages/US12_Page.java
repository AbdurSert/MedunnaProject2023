package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US12_Page {
    public US12_Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@id='login-item']//span")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsernameField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//li[@id='entity-menu']//a[@aria-haspopup='true']//span")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//li[@id='entity-menu']//div[@role='menu']//a[1]//span[1]")
    public WebElement manageCustomersLink;

    @FindBy(xpath = "//th[2]//span[1]")
    public WebElement customerFirstNameColumn;

    @FindBy(xpath = "//span[normalize-space()='Last Name']")
    public WebElement customerLastNameColumn;

    @FindBy(xpath = "//th[4]//span[1]")
    public WebElement customerMiddleInitialColumn;

    @FindBy(xpath = "//span[normalize-space()='Email']")
    public WebElement customerEmailColumn;

    @FindBy(xpath = "//th[6]//span[1]")
    public WebElement customerMobilePhoneNumberColumn;

    @FindBy(xpath = "//th[7]//span[1]")
    public WebElement customerPhoneNumberColumn;

    @FindBy(xpath = "//th[8]//span[1]")
    public WebElement customerAddressColumn;

    @FindBy(xpath = "//span[normalize-space()='Create Date']")
    public WebElement customerCreateDateColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[1]")
    public WebElement customerViewButton;

    @FindBy(xpath = "//div[@id='app-view-container']//a[2]")
    public WebElement editButtonInView;

    @FindBy(xpath = "//li[@id='account-menu']//a[@aria-haspopup='true']")
    public WebElement employeeAccountMenu;

    @FindBy(xpath = "//div[@id='app-header']//a[3]//span[1]")
    public WebElement signOutButton;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[2]")
    public WebElement editButtonInCustomerPage;

    @FindBy(xpath = "//h2[@id='gmibankfrontendApp.tPCustomer.home.createOrEditLabel']//span")
    public WebElement createOrEditLabelInEditPage;

    @FindBy(xpath = "//tbody/tr[2]/td[10]/div[1]/a[2]")
    public WebElement customerEditButton;

    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement emailInCustomerEditPage;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneNumberInCustomerEditPage;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public WebElement addressInCustomerEditPage;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButtonInEditPage;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")
    public WebElement updatedCustomerEmailInCustomerPage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]")
    public WebElement updatedMobilePhoneNumberInCustomerPage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]")
    public WebElement updatedStreetAddressInCustomerPage;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[3]")
    public WebElement deleteButtonInCustomerPage;

    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement confirmDeleteOperationMessage;











}
