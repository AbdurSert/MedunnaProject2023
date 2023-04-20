package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/nav[1]/div[1]/ul[1]/li[8]/a[1]"))
    public WebElement dropdown;

    @FindBy(xpath = ("//a[@id='login-item']//span"))
    public WebElement signin;











}



