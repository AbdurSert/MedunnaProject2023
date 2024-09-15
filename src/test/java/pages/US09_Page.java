package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US09_Page {

    public US09_Page() {

            PageFactory.initElements(Driver.getDriver(), this);
        }


    @FindBy(xpath = ("//a[normalize-space()='9595'])[1]"))
    public WebElement idBox;

    @FindBy(xpath = ("(//a[@id='jh-create-entity'])[1]"))
    public WebElement createANewCustomerBox;
}

