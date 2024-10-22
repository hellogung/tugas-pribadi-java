import java.util.ArrayList;
import java.util.List;

public class User {
    private String username, password;
    private static List<User> databaseUser = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void initUserDatabase() {
        databaseUser.add(new User("202243500145", "123123123"));
    }

    public static boolean login(String username, String password) {
        for (User user : databaseUser) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
