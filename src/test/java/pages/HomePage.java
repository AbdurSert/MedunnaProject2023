package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ("(//*[name()='svg'][@data-icon='user'])[1]"))
    public WebElement dropdown;

    @FindBy(xpath = ("//a[@id='login-item']//span"))
    public WebElement signin;

    @FindBy(xpath = ("//li[@id='entity-menu']//a[@aria-haspopup='true']//span"))
    public WebElement myOperationsText;









}



