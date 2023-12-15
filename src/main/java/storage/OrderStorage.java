package storage;



import model.Order;
import model.User;
import util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OrderStorage implements Serializable {

    private List<Order> orders = new LinkedList<>();
    Map<String, Order> MapId = new HashMap<>();
    Map<User, Order> MapUser = new HashMap<>();

    public void add(Order order) {
        orders.add(order);
        MapId.put(order.getId(), order);
        MapUser.put(order.getUser(),order);
        StorageSerializeUtil.serializeOrderStorage(this);
    }

    public void print() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }


    public Order getById(String id) {
        Order order = MapId.get(id);
        return order;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void printByUser(User currentUser) {
        System.out.println(MapUser.get(currentUser));
    }
}
