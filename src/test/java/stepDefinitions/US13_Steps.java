package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US08_Page;
import pages.US13_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US13_Steps {
    US08_Page us008Pages= new US08_Page();
    US13_Page us013Pages = new US13_Page();

    @And("Employee Username ve password girer, signin butonuna tiklar ve login olur")
    public void employeeUsernameVePasswordGirerSigninButonunaTiklarVeLoginOlur() {
        us008Pages.LoginUsername.sendKeys(ConfigReader.getProperty("EmployeeName"));
        us008Pages.LoginPassword.sendKeys(ConfigReader.getProperty("EmployeePassword"));
        us008Pages.signInButton.submit();//click??

    }

    @And("My Operations butonuna ardindan Manage Accounts butonuna tiklar")
    public void myOperationsButonunaArdindanManageAccountsButonunaTiklar() {
        us013Pages.myOperations.click();
        us013Pages.manageAccounts.click();

    }

    @When("Create my account butonuna tiklar")
    public void createMyAccountButonunaTiklar() {
        us013Pages.createANewAccount.click();

    } @Then("Description alanini bos birakinca uyari alir")
    public void descriptionAlaniniBosBirakincaUyariAlir() {
        us013Pages.description.sendKeys("");
        us013Pages.balance.sendKeys("");
        Assert.assertTrue(us013Pages.thisFieldIsRequired.isDisplayed());
        System.out.println("boşluk");
    }
    @Then("Description alani icin aciklama olusturur")
    public void descriptionAlaniIcinAciklamaOlusturur() {
        us013Pages.description.sendKeys("description123");

    }


    @And("Balance alanina bir sayi girer")
    public void balanceAlaninaBirSayiGirer() {
        us013Pages.balance.sendKeys("100");
    }

    @And("Kullanici hesap tipi olarak CHECKING, SAVING, CREDIT_CARD or INVESTING secebilir")
    public void kullaniciHesapTipiOlarakCHECKINGSAVINGCREDIT_CARDOrINVESTINGSecebilir() {
        Select select = new Select(us013Pages.accountTypeDropdown);
        select.selectByValue("CREDIT_CARD");
        //select.selectByIndex(2);
        String accountType = select.getFirstSelectedOption().getText();
        Assert.assertEquals(accountType,"CREDIT_CARD");
    }

    @And("Hesap durumu ACTIVE, SUSPENDED or CLOSED olarak tanimlanmalidir")
    public void hesapDurumuACTIVESUSPENDEDOrCLOSEDOlarakTanimlanmalidir() {
        Select select = new Select(us013Pages.accountStatusDropdown);
        //select.selectByIndex(0);
        select.selectByVisibleText("SUESPENDED");
        String accountStatus = select.getFirstSelectedOption().getText();
        Assert.assertEquals(accountStatus,"SUESPENDED");
    }

    @And("Kullanici acilir listeden bir calisan secebilir")
    public void kullaniciAcilirListedenBirCalisanSecebilir() {
        Select select = new Select(us013Pages.employeeDropdown);
        select.selectByIndex(0);
        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
    }


    @And("Employee signout butonuna tiklar")
    public void employeeSignoutButonunaTiklar() {
        us013Pages.employee2023.click();
        us013Pages.signOut.click();
        Driver.closeDriver();

    }


}
