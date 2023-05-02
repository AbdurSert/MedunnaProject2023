package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import pages.US03_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US03_Steps {
    US03_Page us003Pages = new US03_Page();
    @Given("kullanıcı gmibank anasayfasına gider")
    public void kullanıcıGmibankAnasayfasınaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("anasayfada giris ikonuna tiklar")
    public void anasayfadaGirisIkonunaTiklar() {
        us003Pages.signInRegister.click();
    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        us003Pages.register.click();
    }

    @When("New password yerine bir kucuk harf girer")
    public void newPasswordYerineBirKucukHarfGirer() {
        us003Pages.newPassword.sendKeys("a");
    }

    @And("bir buyuk harf girer")
    public void birBuyukHarfGirer() {
        us003Pages.newPassword.sendKeys("A");

    }

    @Then("Strength barin bir arttgini test eder")
    public void strengthBarinBirArttginiTestEder() {
        String expectedSecondBarColor = "#ff9900";//turuncu
        String secondBarColor =  us003Pages.strengthBar2.getCssValue("background-color");
        String hexColor = Color.fromString(secondBarColor).asHex();
        System.out.println("ikinci bar "+ hexColor);

        Assert.assertEquals(hexColor,expectedSecondBarColor);
    }

    @And("bir tane rakam girer")
    public void birTaneRakamGirer() {
        us003Pages.newPassword.sendKeys("1");
    }

    @Then("Strength barin iki arttigini test eder")
    public void strengthBarinIkiArttiginiTestEder() {
        String expectedFourthBarColor = "#ffff00"; //sarı
        String fourthBarColor = us003Pages.strengthBar3.getCssValue("background-color");
        String hexColor = Color.fromString(fourthBarColor).asHex();
        System.out.println("ücüncü bar "+ hexColor);

        Assert.assertEquals(expectedFourthBarColor,hexColor);
    }

    @And("bir ozel karakter girer")
    public void birOzelKarakterGirer() {
        us003Pages.newPassword.sendKeys(".");
    }

    @Then("Strengt barin uc arttgini test eder")
    public void strengtBarinUcArttginiTestEder() {
        String expectedFifthBarColor = "#99ff00";//yeşil
        String fifthBarColor = us003Pages.strengthBar4.getCssValue("background-color");
        String hexColor = Color.fromString(fifthBarColor).asHex();
        System.out.println("dördüncu bar "+ hexColor);

        Assert.assertEquals(expectedFifthBarColor,hexColor);
    }

    @And("bir kucuk, bir buyuk harf, bir rakam ile bir ozel karakterden olusan yedi karakter girer")
    public void birKucukBirBuyukHarfBirRakamIleBirOzelKarakterdenOlusanyediKarakterGirer() {
        us003Pages.newPassword.sendKeys("aA1.123");
    }

    @Then("Strength barin hepsinin yandigini test eder")
    public void strengthBarinHepsininYandiginiTestEder() {
        String expectedFifthBarColor = "#00ff00";//yeşil
        String fifthBarColor = us003Pages.strengthBar5.getCssValue("background-color");
        String hexColor = Color.fromString(fifthBarColor).asHex();
        System.out.println("beşinci bar "+ hexColor);
        System.out.println("fift "+fifthBarColor);

        Assert.assertEquals(expectedFifthBarColor,hexColor);
    }

    @And("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
        us003Pages.logo.click();
        Driver.closeDriver();
    }


}
