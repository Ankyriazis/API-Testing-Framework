import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @Test
    public void testGetEndpoint() {
        RestAssured.baseURI = "https://api.example.com";

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("/endpoint")
                .then()
                .statusCode(200)
                .body("key", equalTo("expectedValue"))
                .extract()
                .response();

        // Additional assertions can be added here
    }

    @Test
    public void testPostEndpoint() {
        RestAssured.baseURI = "https://api.example.com";

        String requestBody = "{\"key\":\"value\"}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/endpoint")
                .then()
                .statusCode(201)
                .body("key", equalTo("expectedValue"))
                .extract()
                .response();

        // Additional assertions can be added here
    }

    // Additional test methods can be added here
}