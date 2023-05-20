import java.util.ArrayList;
import java.util.List;

public class UserObject {
    private List<User> users;

    public UserObject() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
