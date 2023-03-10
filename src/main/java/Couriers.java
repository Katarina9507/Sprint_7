import org.apache.commons.lang.RandomStringUtils;

public class Couriers {
    private String login;
    private String password;
    private String firstName;

    public Couriers(String login, String password, String firstName) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
    }

    public Couriers() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static Couriers getRandomCourier(){
        return new Couriers(
                RandomStringUtils.randomAlphanumeric(10) + "",
                "pass",
                "name"
        );
    }
}