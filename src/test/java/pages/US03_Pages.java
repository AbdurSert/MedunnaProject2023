package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US003_Pages {
    public US003_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//li[@id='account-menu']//a[@aria-haspopup='true']")  public WebElement signInRegister;
    @FindBy(xpath="//span[normalize-space()='Register']")  public WebElement register;
    @FindBy(xpath="//input[@id='firstPassword']")  public WebElement newPassword;
    @FindBy(xpath="//form[@id='register-form']//li[1]")  public WebElement strengthBar1;
    @FindBy(xpath="//form[@id='register-form']//li[2]")  public WebElement strengthBar2;
    @FindBy(xpath="//form[@id='register-form']//li[3]")  public WebElement strengthBar3;
    @FindBy(xpath="//form[@id='register-form']//li[4]")  public WebElement strengthBar4;
    @FindBy(xpath="//form[@id='register-form']//li[5]")  public WebElement strengthBar5;
    @FindBy(xpath="//img[@alt='Logo']") public WebElement logo;






}
