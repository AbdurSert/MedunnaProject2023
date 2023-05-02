package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04_Page {

    public US04_Page(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = ("//a[@aria-expanded='true']"))
    public WebElement dropdown;

    @FindBy(xpath = ("//input[@id='username']"))
    public WebElement username;

    @FindBy(xpath = ("//input[@id='password']"))
    public WebElement password;

    @FindBy(xpath = ("//button[@type='submit']//span"))
    public WebElement signin;

    @FindBy (xpath = ("//span[normalize-space()='Cancel']"))
    public WebElement cancelButton;

    @FindBy(xpath = ("//li[@id='entity-menu']//a[@aria-haspopup='true']//span"))
    public WebElement myOperationsText;

    @FindBy(xpath = ("//li[@id='entity-menu']//div[@role='menu']//a[1]//span[1]"))
    public WebElement manageCustomers;








}
