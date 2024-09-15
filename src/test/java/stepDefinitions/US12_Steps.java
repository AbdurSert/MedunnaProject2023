package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US12_Page;
import utilities.ConfigReader;
import utilities.Driver;



public class US12_Steps {
    US12_Page us012Pages = new US12_Page();
    Faker faker = new Faker();
    String customerEmail = faker.internet().emailAddress();
    String customerPhoneNumber = faker.random().nextInt(100,999)+ "-" + faker.random().nextInt(100,999) + "-" +
            faker.random().nextInt(1000,9999);
    String customerStreetAddress = faker.address().streetAddress();
    @And("kullanici Sign In linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {
        us012Pages.signInLink.click();
    }

    @And("kullanici Employee olarak giris yapar")
    public void kullaniciEmployeeOlarakGirisYapar() {
        us012Pages.signInUsernameField.sendKeys(ConfigReader.getProperty("employee_username"));
        us012Pages.signInPasswordField.sendKeys(ConfigReader.getProperty("employee_password"));
        us012Pages.signInSubmitButton.click();
    }

    @And("kullanici my operations linkinden manage customer modulune gider")
    public void kullaniciMyOperationsLinkindenManageCustomerModuluneGider() {
        us012Pages.myOperationsLink.click();
        us012Pages.manageCustomersLink.click();

    }

    @Then("Ad, Soyad, Middle Initial, E-Posta, Cep telefon numarasi, Telefon Numarasi, Adres ve Tarih olusturma basliklarini goruntulenir")
    public void adSoyadMiddleInitialEPostaCepTelefonNumarasiTelefonNumarasiAdresVeTarihOlusturmaBasliklariniGoruntulenir() {

        Assert.assertTrue(us012Pages.customerFirstNameColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerLastNameColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerMiddleInitialColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerEmailColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerMobilePhoneNumberColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerPhoneNumberColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerAddressColumn.isDisplayed());
        Assert.assertTrue(us012Pages.customerCreateDateColumn.isDisplayed());
    }

    @Then("kullanici view secenegini goruntuler")
    public void kullaniciViewSeceneginiGoruntuler() {
        Assert.assertTrue(us012Pages.customerViewButton.isDisplayed());
    }


    @And("Employee hesaptan cikis yapilir")
    public void employeeHesaptanCikisYapilir() throws InterruptedException {
        us012Pages.employeeAccountMenu.click();
        us012Pages.signOutButton.click();
    }

    @Then("kullanici view sayfasinda edit butonunu goruntuler")
    public void kullaniciViewSayfasindaEditButonunuGoruntuler() throws InterruptedException {
        us012Pages.customerViewButton.click();
        Assert.assertTrue(us012Pages.editButtonInView.isDisplayed());
    }

    @Then("kullanici manage customer modulunde Duzenle secenegini gorur")
    public void kullaniciManageCustomerModulundeDuzenleSeceneginiGorur() {
        Assert.assertTrue(us012Pages.editButtonInCustomerPage.isDisplayed());
    }

    @When("kullanici duzenle butonuna tiklar")
    public void kullaniciDuzenleButonunaTiklar() throws InterruptedException {
        us012Pages.editButtonInCustomerPage.click();
    }
    @Then("kullanici Creat or edit a Customer mesajini gorur")
    public void kullaniciCreatOrEditACustomerMesajiniGorur() {
        String expectedMessage ="Create or edit a Customer";
        String actualMessage = us012Pages.createOrEditLabelInEditPage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @And("kullanici guncel e-posta, adres ve telefon numarasi bilgilerini girer")
    public void kullaniciGuncelEPostaAdresVeTelefonNumarasiBilgileriniGirer() throws InterruptedException {
        us012Pages.emailInCustomerEditPage.clear();
        us012Pages.emailInCustomerEditPage.sendKeys(customerEmail);
        us012Pages.addressInCustomerEditPage.clear();
        us012Pages.addressInCustomerEditPage.sendKeys(customerStreetAddress);
        us012Pages.mobilePhoneNumberInCustomerEditPage.clear();
        us012Pages.mobilePhoneNumberInCustomerEditPage.sendKeys(customerPhoneNumber);

    }

    @When("kullanici Save tusunu tiklar")
    public void kullaniciSaveTusunuTiklar() throws InterruptedException {
        us012Pages.saveButtonInEditPage.click();
    }


    @Then("kullanici guncel bilgiler kaydedildi mesajini gorur")
    public void kullaniciGuncelBilgilerKaydedildiMesajiniGorur() throws InterruptedException {

        us012Pages.myOperationsLink.click();
        us012Pages.manageCustomersLink.click();
        String actualCustomerEmail = us012Pages.updatedCustomerEmailInCustomerPage.getText();
        String actualCustomerAddress = us012Pages.updatedStreetAddressInCustomerPage.getText();
        String actualCustomerMobilePhoneNumber = us012Pages.updatedMobilePhoneNumberInCustomerPage.getText();

        System.out.println(customerEmail);
        System.out.println(customerStreetAddress);
        System.out.println(customerPhoneNumber);

        System.out.println(actualCustomerEmail);
        System.out.println(actualCustomerAddress);
        System.out.println(actualCustomerMobilePhoneNumber);

        Assert.assertEquals(customerEmail, actualCustomerEmail);
        Assert.assertEquals(customerStreetAddress, actualCustomerAddress);
        Assert.assertEquals(customerPhoneNumber, actualCustomerMobilePhoneNumber);


    }

    @And("kullanici edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() throws InterruptedException {
        us012Pages.customerEditButton.click();
    }

    @And("kullanici musteri sil tusuna tiklar")
    public void kullaniciMusteriSilTusunaTiklar() {
        us012Pages.deleteButtonInCustomerPage.click();
    }


    @Then("Silme islemini dogrulama mesajini gorur")
    public void silmeIsleminiDogrulamaMesajiniGorur() throws InterruptedException {
        us012Pages.confirmDeleteOperationMessage.isDisplayed();
    Assert.assertTrue(us012Pages.confirmDeleteOperationMessage.isDisplayed());

    }
}
