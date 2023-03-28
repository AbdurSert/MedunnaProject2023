package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class MyStepdefs {
    @Given("ana sayfaya gider")
    public void anaSayfayaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
}
