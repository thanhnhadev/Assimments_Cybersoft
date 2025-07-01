package test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.BuildModelJSON;
import model.PostBody;
import model.RequestCapability;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Path_Method implements RequestCapability {
    public static void main(String[] args) {

        String baseUri = "https://jsonplaceholder.typicode.com";

        RequestSpecification request = given();
        request.baseUri(baseUri);
        request.header(defaultHeader);

    // Form up body
        PostBody postBody = new PostBody();
        postBody.setTitle("New Title");
        String postBodyString = BuildModelJSON.parseJSONString(postBody);
        final String TARGET_POST_ID = "1";
        Response response = request.body(postBodyString).patch("/posts/".concat(TARGET_POST_ID));
        response.then().body("title", equalTo(postBody.getTitle()));
        response.prettyPrint();


    }
}
