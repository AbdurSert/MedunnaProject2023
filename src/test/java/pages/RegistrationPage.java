package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")

    public WebElement register_SignInButton;

    @FindBy (xpath = "(//span[normalize-space()='Register'])[1]")

    public WebElement registerButton;

    @FindBy (id = "ssn")

    public WebElement ssnBlank;

    @FindBy (xpath = "//div[normalize-space()='Ssn is invalid.']")

    public WebElement invalidSsnMessage;

    @FindBy (xpath = "//input[@id='firstname']")

    public WebElement firstName;

    @FindBy (id = "lastname")

    public  WebElement lastName;

    @FindBy (id = "address")

    public WebElement adressField;

    @FindBy (xpath = "//div[@class='invalid-feedback']")

    public WebElement lastNameErrorMessage;

    @FindBy (id = "mobilephone")

    public WebElement mobilePhoneField;

    @FindBy (id = "username")

    public WebElement usernameField;

    @FindBy (id = "email")

    public WebElement emailField;

}
