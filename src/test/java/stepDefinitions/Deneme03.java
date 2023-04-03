package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class Deneme03 {
   static WebDriver driver= Driver.getDriver();

    static US003_Steps us003Steps= new US003_Steps();

    public static void main(String[] args) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        us003Steps.kullanıcıGmibankAnasayfasınaGider();

        us003Steps.anasayfadaGirisIkonunaTiklar();

        us003Steps.registerButonunaTiklar();

        us003Steps.newPasswordYerineBirKucukHarfGirer();

        us003Steps.birBuyukHarfGirer();

        us003Steps.strengthBarinBirArttginiTestEder();


        us003Steps.birTaneRakamGirer();


        us003Steps.strengthBarinIkiArttiginiTestEder();


        us003Steps.birOzelKarakterGirer();


        us003Steps.strengtBarinUcArttginiTestEder();


        us003Steps.birKucukBirBuyukHarfBirRakamIleBirOzelKarakterdenOlusanyediKarakterGirer();


        us003Steps.strengthBarinHepsininYandiginiTestEder();

        System.out.println("Test passt");
        us003Steps.kullanıcıGmibankAnasayfasınaGider();
        us003Steps.tarayiciyiKapatir();



    }


}
