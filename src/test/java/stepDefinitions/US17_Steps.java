package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US17_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US17_Steps {
    US17_Page us017Pages = new US17_Page();
    String deactivatedUserText;
    String deactivatedText;
    String profileLast;

    public void userActivation (WebElement activationButton, String userRole, WebElement profileElement){
        deactivatedText= activationButton.getText();
        profileLast = profileElement.getText();
        if(profileLast.equalsIgnoreCase(userRole)){
            if(deactivatedText.equalsIgnoreCase("Deactivated")){
                activationButton.click();
            }
            else {
                System.out.println("User is already activated!");
            }
        }
        else{
            System.out.println("Profile is NOT " + userRole);
        }

    }

    public void validateActivation(WebElement activationSuccess){
        Driver.refreshPage();
        String actualActivationText = activationSuccess.getText();
        System.out.println(actualActivationText);
        boolean isItemActivated = actualActivationText.endsWith("Activated");
        Assert.assertTrue(isItemActivated);

    }

    public void signOutAsAdmin() throws InterruptedException {
        Driver.refreshPage();
        us017Pages.adminAccountMenu.click();
        us017Pages.signOutButton.click();
        Driver.refreshPage();
    }

    public void elementsAreDisplayed(WebElement element1, WebElement element2, WebElement element3, WebElement element4){
        Assert.assertTrue(element1.isDisplayed());
        Assert.assertTrue(element2.isDisplayed());
        Assert.assertTrue(element3.isDisplayed());
        Assert.assertTrue(element4.isDisplayed());

    }
    @And("Admin olarak sisteme giris yapar")
    public void adminOlarakSistemeGirisYapar() throws InterruptedException {
        us017Pages.signInLink.click();
        us017Pages.signInUsernameField.sendKeys(ConfigReader.getProperty("admin_username"));
        us017Pages.signInPasswordField.sendKeys(ConfigReader.getProperty("admin_password"));
        us017Pages.signInSubmitButton.click();
    }

    @And("Administretion linkine tiklar")
    public void administretionLinkineTiklar() {
        us017Pages.administrationDropDown.click();
    }

    @And("User Management sekmesine gider")
    public void userManagementSekmesineGider() {
        us017Pages.userManagementLink.click();
    }

    @When("kullanici Deactivated bir Role_User profilini aktive eder")
    public void kullaniciDeactivatedBirRole_UserProfiliniAktiveEder() {
        userActivation(us017Pages.activationButtonUserID2178, "ROLE_USER", us017Pages.roleUser);

    }

    @Then("Aktivasyon dogrulanir")
    public void aktivasyonDogrulanir() {
        String activationMessage = us017Pages.activationSuccess.getText();
        System.out.println(activationMessage);
        Assert.assertNotEquals(deactivatedUserText, activationMessage);
    }

    @And("Admin cikis yapar")
    public void adminCikisYapar() throws InterruptedException {
        signOutAsAdmin();
    }

    @When("kullanici Deactivated bir Role_Employee profilini aktive eder")
    public void kullaniciDeactivatedBirRole_EmployeeProfiliniAktiveEder() {
        userActivation(us017Pages.activationButtonEmployee,"ROLE_EMPLOYEE", us017Pages.roleEmployee);

    }

    @Then("kullanici aktivasyonu dogrular")
    public void kullaniciAktivasyonuDogrular()  {
        validateActivation(us017Pages.employeeActivationSuccess);
    }

    @When("kullanici Deactivated bir Role_Manager profilini aktive eder")
    public void kullaniciDeactivatedBirRole_ManagerProfiliniAktiveEder() {
        userActivation(us017Pages.activationButtonManager, "ROLE_MANAGER", us017Pages.roleManager);
    }

    @Then("kullanici manager aktivasyonunu dogrular")
    public void kullaniciManagerAktivasyonunuDogrular() {
        validateActivation(us017Pages.managerActivationSuccess);
    }

    @When("kullanici Deactivated bir Role_Admin profilini aktive eder")
    public void kullaniciDeactivatedBirRole_AdminProfiliniAktiveEder() {
        userActivation(us017Pages.activationButtonAdmin, "ROLE_ADMIN", us017Pages.roleAdmin);
    }

    @Then("kullanici admin aktivasyonunu dogrular")
    public void kullaniciAdminAktivasyonunuDogrular() {
        validateActivation(us017Pages.adminActivationSuccess);
    }

    @Then("kullanicilara ait tum bilgiler goruntulenir")
    public void kullanicilaraAitTumBilgilerGoruntulenir() {
        elementsAreDisplayed(us017Pages.userAccountViewButton, us017Pages.employeeAccountViewButton,
                us017Pages.managerAccountViewButton, us017Pages.adminAccountViewButton);
    }

    @Then("kullanicilara ait bilgiler guncellenir")
    public void kullanicilaraAitBilgilerGuncellenir() {
        elementsAreDisplayed(us017Pages.userAccountEditButton, us017Pages.employeeAccountEditButton,
                us017Pages.managerAccountEditButton, us017Pages.adminAccountEditButton);
    }

    @Then("kullanici tum rolleri siler")
    public void kullaniciTumRolleriSiler() {
        elementsAreDisplayed(us017Pages.userAccountDeleteButton, us017Pages.employeeAccountDeleteButton,
                us017Pages.managerAccountDeleteButton, us017Pages.adminAccountDeleteButton);
    }
}
