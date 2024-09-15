package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US02_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US02_Steps {
    Faker faker = new Faker();
    String invalidSSN1 = faker.regexify("([10-99]){2}([ß|&|%|$|*|#|§|+|≠|!|¡|]){1}([-]){1}([10-99]){2}([-]{1})([1000-9999]){4}");
    String invalidSSN2 = faker.regexify("([10-99]){2}([A-Z]){1}([-]){1}([10-99]){2}([-]{1})([1000-9999]){4}");
    public String InvalidSSN(String key) {

        if (key.equals(invalidSSN1) || key.equals(invalidSSN2)) {
            System.out.println(key);
        }
        return key;
    }
    US02_Page pages = new US02_Page();
    @Given("Kullanici anasayfaya yonlenir")
    public void kullaniciAnasayfayaYonlenir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("kullanici profil menusune tiklar")
    public void kullaniciProfilMenusuneTiklar() {pages.dropdownClick.click();}

    @And("kullanici kayit linkine tiklar")
    public void kullaniciKayitLinkineTiklar() {pages.register.click();
    }

    @And("kullanici SSN girer")
    public void kullaniciSSNGirer() {pages.ssn.sendKeys(faker.random().nextInt(100, 888) + "-" + faker.random().nextInt(10, 99) + "- " +
            faker.random().nextInt(1000, 9999) + Keys.TAB);
    }

    @And("kullanici adini girer")
    public void kullaniciAdiniGirer() {pages.firstName.sendKeys(faker.name().firstName() + Keys.TAB);}

    @And("kullanici soyadini girer")
    public void kullaniciSoyadiniGirer() {pages.lastName.sendKeys(faker.name().lastName() + Keys.TAB);}

    //?
    @And("kullanici adres bilgisi alanini bos birakir")
    public void kullaniciAdresBilgisiAlaniniBosBirakir() {pages.address.sendKeys(Keys.TAB);}

    @And("kullanici telefon numarasini girer")
    public void kullaniciTelefonNumarasiniGirer() {pages.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber() + Keys.TAB);
    }

    @And("kullanici bir kullanici ismi girer")
    public void kullaniciBirKullaniciIsmiGirer() {pages.userName.sendKeys(faker.name().username() + Keys.TAB);}

    @And("kullanici mail adresini girer")
    public void kullaniciMailAdresiniGirer() {pages.eMail.sendKeys(faker.internet().emailAddress() + Keys.TAB);
    }

    @And("kullanici {string} girer")
    public void kullaniciGirer(String arg0) {pages.password.sendKeys(arg0 + Keys.TAB);}

    @And("kullanici {string} dogrular")
    public void kullaniciDogrular(String arg0) {pages.passwordConfirm.sendKeys(arg0 + Keys.TAB);}

    @When("kullanici kayit tusunu tiklar")
    public void kullaniciKayitTusunuTiklar() {pages.registerButton.click();
    }

    @Then("kullanici basarisiz kayit islemini mesaj ile dogrular")
    public void kullaniciBasarisizKayitIsleminiMesajIleDogrular() {
        Assert.assertTrue(pages.message.isDisplayed());
    }

    @And("kullanici gecersiz bir SSN girer")
    public void kullaniciGecersizBirSSNGirer() {
    //    String invalidSSN = faker.regexify("([10-99]){2}([A-Z]){1}([-]){1}([10-99]){2}([-]{1})([1000-9999]){4}");
//        System.out.println(invalidSSN);
//        registerPage.ssn.sendKeys(invalidSSN + Keys.TAB);
        pages.ssn.sendKeys(InvalidSSN(invalidSSN2) + Keys.TAB);
    }

    @And("kullanici adres bilgierini girer")
    public void kullaniciAdresBilgieriniGirer() {
        pages.address.sendKeys(faker.address().city() + Keys.TAB);
    }

    @And("kullanici ozel karakter iceren gecersiz bir SSN girer")
    public void kullaniciOzelKarakterIcerenGecersizBirSSNGirer() {
        String invalidSSN = faker.regexify("([10-99]){2}([ß|&|%|$|*|#|§|+|≠|!|¡|]){1}([-]){1}([10-99]){2}([-]{1})([1000-9999]){4}");
//        System.out.println(invalidSSN);
//        registerPage.ssn.sendKeys(invalidSSN + Keys.TAB);
        pages.ssn.sendKeys(InvalidSSN(invalidSSN1) + Keys.TAB);
    }

    @And("kullanici gecersiz bir {string} girer")
    public void kullaniciGecersizBirGirer(String arg0) {
        //pages.phoneNumber.sendKeys(faker.regexify("[0-9]{2}-[A-Z]{1}-[0-9]{3}-[0-9]{4}"));
        pages.phoneNumber.sendKeys(arg0 + Keys.TAB);
        System.out.println(arg0);
    }

    @And("kullanici gecersiz bir {string} adresi girer")
    public void kullaniciGecersizBirAdresiGirer(String arg0) throws InterruptedException {pages.eMail.sendKeys(arg0 + Keys.TAB);
        System.out.println(arg0);
    }


}
