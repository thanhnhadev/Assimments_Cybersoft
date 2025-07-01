package test;

import com.google.gson.Gson;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.BuildModelJSON;
import model.PostBody;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Puth_Method {
    public static void main(String[] args) {
        String baseUri = "https://jsonplaceholder.typicode.com";

        //Form up request object and header
        RequestSpecification request = given();
        request.baseUri(baseUri);
        request.header(new Header("Content-type", "application/json; charset=UTF-8"));

        //Contruct body
        PostBody postBody_1 = new PostBody(1, 1, "Hello 1", "Goodbye 1");
        PostBody postBody_2 = new PostBody(2, 2, "Hello 2", "Goodbye 2");
        PostBody postBody_3 = new PostBody(3, 3, "Hello 3", "Goodbye 3");
        PostBody postBody_4 = new PostBody(4, 4, "Hello 4", "Goodbye 4");

        List<PostBody> postBodyVdList = Arrays.asList(postBody_1, postBody_2, postBody_3, postBody_4);

        for (PostBody postBody : postBodyVdList){
            System.out.println(postBody);

            String postBodyStr = BuildModelJSON.parseJSONString(postBody);


            // send request
            final int TARGET_POST_NUM = 1;
            Response response = request.body(postBodyStr). put("/posts/".concat(String.valueOf(TARGET_POST_NUM)));
            response.then().body("title", equalTo(postBody.getTitle()));

        }


    }

}
