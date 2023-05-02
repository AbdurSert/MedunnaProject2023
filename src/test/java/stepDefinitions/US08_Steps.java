package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import pages.US008_Pages;
import utilities.Driver;

public class US08_Steps {
    US008_Pages us008Pages= new US008_Pages();
    @And("signin butonuna tiklar")
    public void signinButonunaTiklar() {
        us008Pages.mainSignIn.click();
    }

    @And("Username ve password girer, signin butonuna tiklar ve login olur")
    public void usernameVePasswordGirerSigninButonunaTiklarVeLoginOlur() {
        us008Pages.LoginUsername.sendKeys("admin2023");
        us008Pages.LoginPassword.sendKeys("Admin.Strator23");
        us008Pages.signInButton.submit();//click??
    }

    @And("Administrator butonuna tıklar")
    public void administratorButonunaTıklar() {
        us008Pages.adminStrator.click();
    }

    @And("passworda tıklar")
    public void passwordaTıklar() {
        us008Pages.passwordButton.click();
    }

    @And("current passwordu girer")
    public void currentPassworduGirer() throws InterruptedException {
        us008Pages.currentPassword.sendKeys("Admin.Strator23");
    }

    @When("New password kutusuna eski password girer")
    public void newPasswordKutusunaEskiPasswordGirer() throws InterruptedException {
        us008Pages.newPassword.sendKeys("Admin.Strator23");
        us008Pages.newPasswordConfirmation.sendKeys("Admin.Strator23");
        us008Pages.save.click();

    }

    @Then("eski password girilemeyecegi uyarisini alir")
    public void eskiPasswordGirilemeyecegiUyarisiniAlir() throws InterruptedException {
        us008Pages.newPasswordConfirmation.clear();

        Assert.assertTrue(us008Pages.newPasswordShouldBeDiffere.isDisplayed());

    }

    @When("New password kutusuna bir kucuk harf girer")
    public void newPasswordKutusunaBirKucukHarfGirer() throws InterruptedException {
        us008Pages.newPassword.clear();
        us008Pages.newPasswordConfirmation.click();
        us008Pages.newPassword.sendKeys("a");

    }

    @And("Sonra buyuk harf ekler")
    public void sonraBuyukHarfEkler() throws InterruptedException {
        us008Pages.newPassword.sendKeys("A");

    }

    @Then("Strength barin bir arttigini dogrular")
    public void strengthBarinBirArttiginiDogrular() throws InterruptedException {
        String expectedSecondBarColor = "#ff9900";//turuncu
        String secondBarColor =  us008Pages.strengthBar2.getCssValue("background-color");
        String hexColor = Color.fromString(secondBarColor).asHex();
        System.out.println("ikinci bar "+ hexColor);

        Assert.assertEquals(hexColor,expectedSecondBarColor);
    }

    @And("bir rakam ekler")
    public void birRakamEkler() throws InterruptedException {
        us008Pages.newPassword.sendKeys("1");
    }

    @Then("Strength barin iki arttigini dogrular")
    public void strengthBarinIkiArttiginiDogrular() throws InterruptedException {
        String expectedFourthBarColor = "#ffff00"; //sarı
        String fourthBarColor = us008Pages.strengthBar3.getCssValue("background-color");
        String hexColor = Color.fromString(fourthBarColor).asHex();
        System.out.println("ücüncü bar "+ hexColor);

        Assert.assertEquals(expectedFourthBarColor,hexColor);
    }

    @And("ozel karakter ekler")
    public void ozelKarakterEkler() throws InterruptedException {
        us008Pages.newPassword.sendKeys(".");
    }

    @Then("Strengt barin uc arttgini dogrular")
    public void strengtBarinUcArttginiDogrular() throws InterruptedException {
        String expectedFifthBarColor = "#99ff00";//yeşil
        String fifthBarColor = us008Pages.strengthBar4.getCssValue("background-color");
        String hexColor = Color.fromString(fifthBarColor).asHex();
        System.out.println("dördüncu bar "+ hexColor);

        Assert.assertEquals(expectedFifthBarColor,hexColor);

    }

    @And("bir kucuk, bir buyuk harf, bir rakam ile bir ozel karakter iceren yedi karakter girer")
    public void birKucukBirBuyukHarfBirRakamIleBirOzelKarakterIcerenYediKarakterGirer() throws InterruptedException {
        us008Pages.newPassword.sendKeys("aA1.123");

    }

    @Then("Strength barin tamamen yandigini test eder")
    public void strengthBarinTamamenYandiginiTestEder() {
        String expectedFifthBarColor = "#00ff00";//yeşil
        String fifthBarColor = us008Pages.strengthBar5.getCssValue("background-color");
        String hexColor = Color.fromString(fifthBarColor).asHex();
        System.out.println("beşinci bar "+ hexColor);
        System.out.println("fift "+fifthBarColor);

        Assert.assertEquals(expectedFifthBarColor,hexColor);
    }

    @And("Administrator signout butonuna tiklar")
    public void administratorSignoutButonunaTiklar() {
        us008Pages.adminStrator.click();
        us008Pages.signOut.click();
        Driver.closeDriver();
    }
}
