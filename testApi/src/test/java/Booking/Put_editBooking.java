package Booking;

import BookingHelper.TokenManager;
import BookingModel.BookingDates;
import BookingModel.PostBody_booking;
import com.google.gson.Gson;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Put_editBooking {


    public static void main(String[] args) {

        String baseURI = "https://restful-booker.herokuapp.com";
        String token = TokenManager.getToken(); // ✅ Lấy token từ class riêng

        System.out.println("TOKEN: " + token);

        // Tạo payload
        BookingDates dates = new BookingDates();
        dates.setCheckin("2024-05-05");
        dates.setCheckout("2025-06-06");


        PostBody_booking postBody = new PostBody_booking();
        postBody.setFirstname("HezxcHe");
        postBody.setLastname("HAHAzxc");
        postBody.setTotalprice(400);
        postBody.setDepositpaid(false);
        postBody.setBookingdates(dates);
        postBody.setAdditionalneeds("Hu tiu Mi");

        Gson gson = new Gson();
        String body = gson.toJson(postBody);

        // Gửi PUT request
        RequestSpecification request = given()
                .baseUri(baseURI)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token) // ✅ Truyền token đúng cách
                .body(body);

        Response response = request.put("/booking/" + postBody.getBookingid()); // ✅ Đảm bảo có /booking/{id}
        response.prettyPrint();

//        response.then().statusCode(2);
    }
}
