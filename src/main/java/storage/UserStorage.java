package storage;



import model.User;
import model.enums.UserType;
import util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStorage implements Serializable {

    private List<User> users = new ArrayList<>();
    Map<String, User> MapEmail = new HashMap<>();
    Map<UserType, User> MapType = new HashMap<>();

    public void add(User user) {
        users.add(user);
        MapEmail.put(user.getEmail(), user);
        MapType.put(user.getUserType(), user);
        StorageSerializeUtil.serializeUserStorage(this);
    }

    public void print() {
        for (User user : users) {
            System.out.println(user);
        }
    }


    public User getByEmail(String email) {
        User user = MapEmail.get(email);
        return user;
    }

    public void printByType(UserType userType) {
        System.out.println(MapType.get(userType));
    }
}
