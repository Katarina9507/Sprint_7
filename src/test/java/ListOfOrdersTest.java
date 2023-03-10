import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.notNullValue;

public class ListOfOrdersTest extends DataForTests {

    @Before
    public void setUp() {
        RestAssured.baseURI = "http://qa-scooter.praktikum-services.ru";
    }

    @DisplayName("Check value orders in list of orders")
    @Test
    public void checkOrdersFieldInListOfOrdersTest(){
        Response response = given()
                .when()
                .header("Content-type", "application/json")
                .get(apiOrder);
        response.then().log().all();
        MatcherAssert.assertThat("orders", notNullValue());
    }
}