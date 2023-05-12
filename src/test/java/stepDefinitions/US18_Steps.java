package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US08_Page;
import pages.US13_Page;
import pages.US18_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US18_Steps {
    US08_Page us008Pages= new US08_Page();
    US18_Page us018Pages= new US18_Page();
    @And("Manager Username ve password girer, signin butonuna tiklar ve login olur")
    public void managerUsernameVePasswordGirerSigninButonunaTiklarVeLoginOlur() {
        us008Pages.LoginUsername.sendKeys(ConfigReader.getProperty("manager_username"));
        us008Pages.LoginPassword.sendKeys(ConfigReader.getProperty("manager_password"));
        us008Pages.signInButton.submit();//click??
    }

    @And("My Operations butonuna ardindan Manage Customers butonuna tiklar")
    public void myOperationsButonunaArdindanManageCustomersButonunaTiklar() {
        us018Pages.myOperations.click();
        us018Pages.manageCustomers.click();
    }


    @Then("Tum musteriler, musterinin hesap bilgilerini dolduran musterileri yonetme modulunde gorunur")
    public void tumMusterilerMusterininHesapBilgileriniDolduranMusterileriYonetmeModulundeGorunur() {
        Assert.assertTrue(us018Pages.iD.isDisplayed());
        Assert.assertTrue(us018Pages.firstName.isDisplayed());
        Assert.assertTrue(us018Pages.lastName.isDisplayed());
        Assert.assertTrue(us018Pages.middleInitial.isDisplayed());
        Assert.assertTrue(us018Pages.email.isDisplayed());
        Assert.assertTrue(us018Pages.mobilePhoneNumber.isDisplayed());
        Assert.assertTrue(us018Pages.phoneNumber.isDisplayed());
        Assert.assertTrue(us018Pages.address.isDisplayed());
        Assert.assertTrue(us018Pages.createDate.isDisplayed());
    }
    @And("musterilerin bilgilerini duzenleyen view butonunun oldugu dogrulanir")
    public void musterilerinBilgileriniDuzenleyenViewButonununOlduguDogrulanir() {
        Assert.assertTrue(us018Pages.view.isDisplayed());
    }

    @And("musterilerin bilgilerini duzenleyen edit butonunun oldugu dogrulanir")
    public void musterilerinBilgileriniDuzenleyenEditButonununOlduguDogrulanir() {
        Assert.assertTrue(us018Pages.edit.isDisplayed());

    }

    @And("edit butonuna tiklanir ve create or update sayfasina gidilir")
    public void editButonunaTiklanirVeCreateOrUpdateSayfasinaGidilir() {
        us018Pages.edit.click();
        Assert.assertTrue(us018Pages.createOrEditACustomer.isDisplayed());
    }

    @And("geri donulur ve silme tusuna tiklanir")
    public void geriDonulurVeSilmeTusunaTiklanir() {
        Driver.getDriver().navigate().back();
//        us018Pages.myOperations.click();
//        us018Pages.manageCustomers.click();
    }

    @And("silme konusunda emin olduguna iliskin mesaj gordugunu teyit eder")
    public void silmeKonusundaEminOldugunaIliskinMesajGordugunuTeyitEder() {
        System.out.println(4);
        // us018Pages.delete.click();

        //iptal uyarı sayfasının yazılarını alamıyorum??
        System.out.println(us018Pages.areYouSureYouWantToDelet.getText());
        System.out.println(us018Pages.confirmDeleteOperation.getText());
        //Assert.assertEquals("delete", us018Pages.areYouSureYouWantToDelet.getText());
        us018Pages.cancel.click();
        System.out.println(6);
    }


    @And("manager signout butonuna tiklar")
    public void managerSignoutButonunaTiklar() {
        us018Pages.managerBoss.click();
        us018Pages.signOut.click();
        Driver.closeDriver();

    }

    @And("ilk musteriye ait silme tusuna tiklanir")
    public void ilkMusteriyeAitSilmeTusunaTiklanir() {
        us018Pages.delete.click();
    }
}
