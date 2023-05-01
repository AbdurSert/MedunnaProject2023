package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ReusableMethods {

    private static int timeout = 5;

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String generateToken(){

        //String admin_username = "admin2023";
        //String admin_password = "Admin.Strator23";
        Map<String,Object> map = new HashMap<>();
        map.put("username",ConfigReader.getProperty("admin_username"));
        map.put("password",ConfigReader.getProperty("admin_password"));

        String endPoint = ConfigReader.getProperty("urlEndPointAuthenticate");
        Response response = given().
                contentType(ContentType.JSON).
                body(map).
                when().
                post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");
    }
}
