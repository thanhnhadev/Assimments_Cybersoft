package test;

import com.google.gson.Gson;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.PostBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Post_Method {
    public static void main(String[] args) {

        String baseUri = "https://jsonplaceholder.typicode.com";

        RequestSpecification request = given();
        request.baseUri(baseUri);
        request.header(new Header("Content-type", "application/json; charset=UTF-8"));

        Gson gson = new Gson();
        PostBody postBodyVd = new PostBody(1, 1, "Meo", "Gau");

        Response response = request.body(gson.toJson(postBodyVd)).post("/posts");
        response.prettyPrint();

        // Verification
        response.then().statusCode(201);
        response.then().body("userId", equalTo(1));



    }
}
