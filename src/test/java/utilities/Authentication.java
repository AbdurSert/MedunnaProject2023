package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static String generateToken(){

        String admin_username = "admin2023";
        String admin_password = "Admin.Strator23";
        Map<String,Object> map = new HashMap<>();
        map.put("username",admin_username);
        map.put("password",admin_password);

        String endPoint = "https://www.gmibank.com/api/authenticate";
        Response response = given().
                contentType(ContentType.JSON).
                body(map).
                when().
                post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");
    }

    public static void main(String[] args) {
        System.out.println(generateToken());
    }
}
