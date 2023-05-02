package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US007_Pages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US007_Steps {
    US007_Pages us007Page = new US007_Pages();
    public void selectAnItemFromDropdown(WebElement item, String selectableItem) throws InterruptedException {
        Driver.wait(5);
        Select select = new Select(item);
        for (int i=0; i<select.getOptions().size(); i++){
            if(select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)){
                select.getOptions().get(i).click();
                break;
            }
        }

    }
    @And("kullanici sign in eder")
    public void kullaniciSignInEder() throws InterruptedException {
        us007Page.signInLink.click();
        //Driver.wait(2);
        us007Page.usernameSignIn.sendKeys(ConfigReader.getProperty("user_username"));
        //Driver.wait(2);
        us007Page.passwordSignIn.sendKeys(ConfigReader.getProperty("user_password"));
        //Driver.wait(2);
        us007Page.signInButton.click();
        //Driver.wait(2);
    }

    @And("kullanici menuden user infoya gider")
    public void kullaniciMenudenUserInfoyaGider() throws InterruptedException {
        us007Page.userAccount.click();
        //Driver.wait(2);
        us007Page.userInfoLink.click();
        //Driver.wait(2);
    }

    @When("kullanici invalid bir {string} girer")
    public void kullaniciInvalidBirGirer(String arg0) throws InterruptedException {
        us007Page.userEmailField.clear();
        //Driver.wait(3);
        us007Page.userEmailField.sendKeys(arg0);
        //Driver.wait(2);
    }

    @Then("invalid e-posta mesajini gorur")
    public void invalidEPostaMesajiniGorur() throws InterruptedException {
        Assert.assertTrue(us007Page.invalidEmailMessage.isDisplayed());
        //Driver.wait(2);
    }

    @And("kullanici user menuden cikis yapar")
    public void kullaniciUserMenudenCikisYapar() throws InterruptedException {
        us007Page.userAccount.click();
        //Driver.wait(2);
        us007Page.signOutButton.click();
        //Driver.wait(2);
    }

    @Then("kullanici Ingilzce ve Turkce secenegini gorur")
    public void kullaniciIngilzceVeTurkceSeceneginiGorur() throws InterruptedException {
        selectAnItemFromDropdown(us007Page.selectLanguage, "Türkçe");
        selectAnItemFromDropdown(us007Page.selectLanguage, "English");
        Select choose = new Select(us007Page.selectLanguage);
        List<WebElement> languageList = choose.getOptions();
        System.out.println(languageList.size());
        Assert.assertEquals(2, languageList.size());
    }
}
