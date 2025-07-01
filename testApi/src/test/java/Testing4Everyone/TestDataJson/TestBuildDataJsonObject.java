package Testing4Everyone.TestDataJson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.datafaker.Faker;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestBuildDataJsonObject {
//
//    // Test Data
//    private String firstName;
//    private String lastName;
//    private int totalprice;
//    private boolean depositpaid;
//    private String checkin;
//    private String checkout;
//    private String additionalneeds;
//
//    @BeforeClass
//    public void setup() {
//        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
//    }
//
//    @BeforeTest
//    public void prepareTestData() {
//        Faker faker = new Faker();
//        firstName = faker.name().firstName();
//        lastName = faker.name().lastName();
//        totalprice = faker.number().numberBetween(100, 1000);
//        depositpaid = faker.bool().bool();
//        checkin = faker.date().future(10, java.util.concurrent.TimeUnit.DAYS)//faker.date().future(): Tạo ngày tương lai.
//                .toInstant().toString().substring(0, 10);   // .toInstant().toString().substring(0, 10): Định dạng về chuỗi "yyyy-MM-dd" chuẩn API yêu cầu.
//
//
//        checkout = faker.date().future(20, java.util.concurrent.TimeUnit.DAYS).toInstant()
//                .toString().substring(0, 10);
//        additionalneeds = faker.book().genre();
//    }
//
//    @Test
//    public void testCreateBooking() {
//        // Create bookingdates object
//        JSONObject bookingdates = new JSONObject();
//        bookingdates.put("checkin", checkin);
//        bookingdates.put("checkout", checkout);
//
//        // Create main payload
//        JSONObject payload = new JSONObject();
//        payload.put("firstname", firstName);
//        payload.put("lastname", lastName);
//        payload.put("totalprice", totalprice);
//        payload.put("depositpaid", depositpaid);
//        payload.put("bookingdates", bookingdates);
//        payload.put("additionalneeds", additionalneeds);
//
//        System.out.println("Request Payload:\n" + payload.toString(2));
//
//        // Build request
//        RequestSpecification request = given()
//                .contentType("application/json")
//                .accept("application/json")
//                .body(payload.toString());
//
//        // Send request
//        Response response = request.post("/booking");
//
//        response.prettyPrint();
//
//        // Validate response
//        response.then().statusCode(200);
//        response.then().body("booking.firstname", equalTo(firstName));
//        response.then().body("booking.lastname", equalTo(lastName));
//    }
}
