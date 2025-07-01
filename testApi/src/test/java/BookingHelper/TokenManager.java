package BookingHelper;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class TokenManager {

    public static String getToken() {
        String baseURL = "https://restful-booker.herokuapp.com";

        RequestSpecification request = given();
        request.baseUri(baseURL)
                .contentType("application/json");

        String jsonBody = "{ \"username\": \"admin\", \"password\": \"password123\" }";

        Response response = request.body(jsonBody).post("/auth");
        return response.jsonPath().getString("token");
    }
}
