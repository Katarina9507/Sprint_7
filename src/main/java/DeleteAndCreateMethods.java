import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class DeleteAndCreateMethods extends DataForTests {

    public void createAccount(){
        Couriers successfulCourier = new Couriers(existingLogin, existingLoginPassword, existingLoginFirstName);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(successfulCourier)
                .when()
                .post(apiCourier);
    }

    public void deleteAccount(){
        Login login = new Login(existingLogin, existingLoginPassword);
        Response response =
                given()
                        .header("Content-type", "application/json")
                        .and()
                        .body(login)
                        .when()
                        .post(apiLogin);
        String id = response.jsonPath().getString("id");
        given()
                .when()
                .delete(apiLogin + id);
    }
}