package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06_Page {

    public US06_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")

    public WebElement register_SignInButton;


    @FindBy (id = "login-item")

    public WebElement signInField;


    @FindBy(id = "username")

    public WebElement userNameField;

    @FindBy (id = "password")

    public WebElement passwordField;

    @FindBy (xpath = "(//button[@type='submit'])[1]")

    public WebElement SignInButton;

    @FindBy (xpath = "(//a[@class='dropdown-toggle nav-link'])[3]")

    public WebElement userNameDropDown;

    @FindBy (xpath = "(//span[normalize-space()='User Info'])[1]")

    public WebElement userInfoField;

    @FindBy (id = "settings-form")

    public WebElement userSettingsForm;

    @FindBy (id = "firstName")

    public WebElement userFirstName;

    @FindBy (id = "lastName")

    public WebElement userLastNAme;

    @FindBy (id = "email")

    public WebElement userEmail;


}
