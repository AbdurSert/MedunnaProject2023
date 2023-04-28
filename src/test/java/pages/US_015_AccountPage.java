package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015_AccountPage {

    public US_015_AccountPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="(//a[@role='menuitem'])[2]")
    public WebElement manageAccounts;

    @FindBy(xpath="(//span[contains(text(),'View')])[1]")
    public WebElement view;

    @FindBy(xpath="(//span[text()='Account']")
    public WebElement accountTransaction;
}
