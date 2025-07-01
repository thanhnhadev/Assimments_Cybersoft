package Testing4Everyone.TestDataJson;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.datafaker.Faker;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class CreateBooking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String checkin;
    private String checkout;
    private String additionalneeds;

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @BeforeTest
    public void prepareTestData(){
        Faker faker = new Faker();
        firstname = faker.name().firstName();
        lastname = faker.name().lastName();
        totalprice = faker.number().numberBetween(10, 500);
        depositpaid = faker.bool().bool();
        checkin = faker.date().future(10, TimeUnit.DAYS)
                .toInstant().toString().substring(0, 10);
        checkout = faker.date().future(20, TimeUnit.DAYS)
                .toInstant().toString().substring(0, 10);
        additionalneeds = faker.olympicSport().ancientOlympics();

    }


    @Test
    public void testCreateBooking(){

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", checkin);
        bookingdates.put("checkout", checkout);

        JSONObject payload = new JSONObject();
        payload.put("firstname", firstname);
        payload.put("lastname", lastname);
        payload.put("totalprice", totalprice);
        payload.put("depositpaid", depositpaid);
        payload.put("bookingdates", bookingdates);
        payload.put("additionalneeds", additionalneeds);



        System.out.println("Body: " + payload.toString(2));

        RequestSpecification request = given()
                .contentType("application/json")
                .accept("application/json")
                .body(payload.toString());

        Response response = request.post("/booking");

        response.prettyPrint();

        // Validate response
        response.then().statusCode(200);
        response.then().body("booking.firstname", equalTo(firstname));
        response.then().body("booking.lastname", equalTo(lastname));


    }

}
