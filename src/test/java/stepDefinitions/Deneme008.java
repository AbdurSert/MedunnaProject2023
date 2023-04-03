package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class Deneme008 {
    static WebDriver driver = Driver.getDriver();

    static US003_Steps us003Steps = new US003_Steps();
    static US008_Steps us008Steps = new US008_Steps();


    public static void main(String[] args) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        us003Steps.kullanıcıGmibankAnasayfasınaGider();
        us003Steps.anasayfadaGirisIkonunaTiklar();
        us008Steps.signinButonunaTiklar();
        us008Steps.usernameVePasswordGirerSigninButonunaTiklarVeLoginOlur();
        us008Steps.administratorButonunaTıklar();
        us008Steps.passwordaTıklar();
        us008Steps.currentPassworduGirer();
        us008Steps.newPasswordKutusunaEskiPasswordGirer();


        us008Steps.eskiPasswordGirilemeyecegiUyarisiniAlir();

        us008Steps.newPasswordKutusunaBirKucukHarfGirer();
        us008Steps.sonraBuyukHarfEkler();
        us008Steps.strengthBarinBirArttiginiDogrular();
        us008Steps.birRakamEkler();
        us008Steps.strengthBarinIkiArttiginiDogrular();
        us008Steps.ozelKarakterEkler();
        us008Steps.strengtBarinUcArttginiDogrular();
        us008Steps.birKucukBirBuyukHarfBirRakamIleBirOzelKarakterIcerenYediKarakterGirer();
        us008Steps.strengthBarinTamamenYandiginiTestEder();



    }
}
