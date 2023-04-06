package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loginpage {

    public Loginpage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = ("//input[@id='username']"))
    public WebElement username;

    @FindBy(xpath = ("//input[@id='password']"))
    public WebElement password;

    @FindBy(xpath = ("//button[@type='submit']//span"))
    public WebElement signin;

    @FindBy (xpath = ("//span[normalize-space()='Cancel']"))
    public WebElement cancelButton;







}
