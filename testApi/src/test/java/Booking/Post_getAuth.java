package Booking;

import com.google.gson.Gson;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import BookingModel.PostBody_booking;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_getAuth {

    public static void main(String[] args) {

        String baseURL = "https://restful-booker.herokuapp.com";

        // Request Scope
        RequestSpecification request = given();
        request.baseUri(baseURL);

        request.header(new Header("Content-Type", "application/json; charset=UTF-8"));

//        String postBody = "{\n" +
//                "\"username\" : \"admin\",\n" +
//                "\"password\" : \"password123\" \n" +
//                "}";

        Gson gson = new Gson();
        PostBody_booking postBodyBooking = new PostBody_booking();
        postBodyBooking.setUsername("admin");
        postBodyBooking.setPassword("password123");

        // Send POST request
        Response response = request.body(gson.toJson(postBodyBooking)).post("/auth");
        response.prettyPrint();

        // Verification
        response.then().statusCode(equalTo(200));

        String hydra_auth = response.jsonPath().getString("token");
        postBodyBooking.setHydra_auth(hydra_auth);
        System.out.println("token da luu: " + postBodyBooking.getHydra_auth());

    }



}
