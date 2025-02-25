import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    static {
        RestAssured.baseURI = "https://api.example.com"; // Replace with your API base URL
    }

    @Test
    public void testGetEndpoint() {
        Response response = given()
                .header("Authorization", "Bearer your_token") // Replace with your token
                .when()
                .get("/endpoint") // Replace with your endpoint
                .then()
                .statusCode(200)
                .extract()
                .response();

        String expectedValue = "expectedValue"; // Replace with expected value
        response.then().body("key", equalTo(expectedValue)); // Replace with actual key
    }

    @Test
    public void testPostEndpoint() {
        Response response = given()
                .header("Authorization", "Bearer your_token") // Replace with your token
                .contentType("application/json")
                .body("{\"key\":\"value\"}") // Replace with your request body
                .when()
                .post("/endpoint") // Replace with your endpoint
                .then()
                .statusCode(201)
                .extract()
                .response();

        String expectedValue = "expectedValue"; // Replace with expected value
        response.then().body("key", equalTo(expectedValue)); // Replace with actual key
    }
}