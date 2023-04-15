package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US017_Pages {
    public US017_Pages() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@id='login-item']//span")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsernameField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPasswordField;

    @FindBy(xpath = "//button[@type='submit']//span")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//li[@id='admin-menu']//a[@aria-haspopup='true']//span")
    public WebElement administrationDropDown;

    @FindBy(xpath = "//li[@id='admin-menu']//div[@role='menu']//a[1]//span[1]")
    public WebElement userManagementLink;

    @FindBy(xpath = "//tbody/tr[@id='abidincokyoruldu']/td/div/span[1]")
    public WebElement roleUser;

    @FindBy(xpath = "//tr[@id='abidincokyoruldu']//button[@type='button']")
    public WebElement activationButtonUserID2178;

    @FindBy(xpath = "(//button[@class='btn btn-success'])[1]")
    public WebElement activationSuccess;

    @FindBy(xpath = "//li[@id='account-menu']//a[@aria-haspopup='true']//span")
    public WebElement adminAccountMenu;

    @FindBy(xpath = "//li[@id='account-menu']//a[3]//span[1]")
    public WebElement signOutButton;

    @FindBy(xpath = "//tr[@id='kelvinistired']//button[@type='button']")
    public WebElement activationButtonEmployee;

    @FindBy(xpath = "//tbody/tr[@id='kelvinistired']/td/div/span[1]")
    public WebElement roleEmployee;

    @FindBy(xpath = "//tr[@id='kelvinistired']//button[@type='button']//span")
    public WebElement employeeActivationSuccess;

    @FindBy(xpath = "//tr[@id='iradayoruldu']//button[@type='button']//span")
    public WebElement activationButtonManager;

    @FindBy(xpath = "//tbody/tr[@id='iradayoruldu']/td/div/span[1]")
    public WebElement roleManager;

    @FindBy(xpath = "//tr[@id='iradayoruldu']//button[@type='button']")
    public WebElement managerActivationSuccess;

    @FindBy(xpath = "//tr[@id='michael']//button[@type='button']")
    public WebElement activationButtonAdmin;

    @FindBy(xpath = "//tbody/tr[@id='michael']/td/div/span[1]")
    public WebElement roleAdmin;

    @FindBy(xpath = "//tr[@id='michael']//button[@type='button']//span")
    public WebElement adminActivationSuccess;

    @FindBy(xpath = "//tr[@id='abidincokyoruldu']//div//a[1]")
    public WebElement userAccountViewButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/abidincokyoruldu/edit']")
    public WebElement userAccountEditButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/abidincokyoruldu/delete']//span//span")
    public WebElement userAccountDeleteButton;

    @FindBy(xpath = "//tr[@id='kelvinistired']//div//a[1]")
    public WebElement employeeAccountViewButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/kelvinistired/edit']")
    public WebElement employeeAccountEditButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/kelvinistired/delete']")
    public WebElement employeeAccountDeleteButton;

    @FindBy(xpath = "//tr[@id='iradayoruldu']//div//a[1]")
    public WebElement managerAccountViewButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/iradayoruldu/edit']")
    public WebElement managerAccountEditButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/iradayoruldu/delete']")
    public WebElement managerAccountDeleteButton;

    @FindBy(xpath = "//tr[@id='michael']//div//a[1]")
    public WebElement adminAccountViewButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/michael/edit']//span//span")
    public WebElement adminAccountEditButton;

    @FindBy(xpath = "//a[@href='/admin/user-management/michael/delete']")
    public WebElement adminAccountDeleteButton;










}
