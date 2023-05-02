package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US15_Page {

    public US15_Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//span[text()='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath="(//a[@role='menuitem'])[2]")
    public WebElement manageAccounts;

    @FindBy(xpath="(//span[contains(text(),'View')])[1]")
    public WebElement view;

    @FindBy(xpath="(//span[text()='Account']")
    public WebElement accountTransaction;

    @FindBy(xpath = "//div[@id=\"app-view-container\"]/div[1]/div/div/div/div[1]/div/table/thead")
    public WebElement Transactions;


}
