package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_010_NewCustomerPage {

    public US_010_NewCustomerPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement myOperations;

    @FindBy(xpath="(//a[@role='menuitem'])[1]")
    public WebElement manageCustomers;

    @FindBy(xpath="//a[@id='jh-create-entity']")
    public WebElement createANewCustomer;

    @FindBy(xpath="//input[@id='tp-customer-address']")
    public WebElement address;

    @FindBy(xpath="//input[@id='tp-customer-city']")
    public WebElement city;

    @FindBy(xpath="(//div[contains(text(),'This field is required.')])[1]")
    public WebElement thisFieldIsRequiredAddress;

    @FindBy(xpath="(//div[text()=\"This field is required.\"])[2]")
    public WebElement thisFieldIsRequiredCity;

    @FindBy(xpath="//select[@id='tp-customer-country']")
    public WebElement country;

    @FindBy(xpath="//input[@id='tp-customer-state']")
    public WebElement state;





}
