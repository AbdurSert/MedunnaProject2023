package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US019Pages {

    @FindBy (xpath = ("//a[@id='jh-create-entity']"))
    public WebElement createNewAccount;

    @FindBy (xpath = ("//input[@id='tp-account-description']"))
    public WebElement descriptionBox;

    @FindBy (xpath = ("//input[@id='tp-account-balance']"))
    public WebElement balanceBox;

    @FindBy(xpath = ("//button[@id='save-entity']//span"))
    public WebElement saveBox;

    @FindBy(xpath = ("//li[@id='entity-menu']//a[2]"))
    public WebElement manageAccounts;

    @FindBy (xpath = ("//select[@id='tp-account-accountType']"))
    public WebElement accountTypeBox;

}
