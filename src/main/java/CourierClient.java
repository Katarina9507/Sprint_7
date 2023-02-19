import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

public class CourierClient extends DataForTests {

    @Step("Get response for Courier")
    public ValidatableResponse getCourierResponse(Couriers courier) {
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(courier)
                .when()
                .post(apiCourier)
                .then();
    }
    @Step("Get response for Login")
    public ValidatableResponse getLoginResponse(Login login) {
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(login)
                .when()
                .post(apiCourier)
                .then();
    }
}