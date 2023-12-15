package storage;



import model.Product;
import util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductStorage implements Serializable {

    private Set<Product> products = new HashSet<>();
    Map<String, Product> MapId = new HashMap<>();

    public void add(Product product) {
        products.add(product);
        MapId.put(product.getId(), product);
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public Product getById(String id) {
        Product product = MapId.get(id);
        return product;
    }

    public void print() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
