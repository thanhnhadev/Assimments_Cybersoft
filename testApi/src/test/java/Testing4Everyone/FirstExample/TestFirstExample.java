package Testing4Everyone.FirstExample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestFirstExample {



    @Test
    public void TestSignUp(){
        String payload = "{\n" +
                "    \"firstname\": \"Quoc Bao\",\n" +
                "    \"lastname\": \"Duong\",\n" +
                "    \"totalprice\": 500,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"{2022-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Fresh Food\"\n" +
                "}";

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

//        given().header("Content-Type", "application/json")
//                .header("Accept", "application/json")
//                .body(payload)
//                .when()
//                .post("/booking")
//                .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON);

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(payload)
                .when()
                .post("/booking");

        Assert.assertEquals(response.getStatusCode(), 200);
        response.prettyPrint();




    }

}
