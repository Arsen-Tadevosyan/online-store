package model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enums.ProductType;

import java.io.Serializable;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    private String id;
    private String name;
    private String description;
    private int stockQty;
    private double price;
    private ProductType productType;
    private boolean isRemoved = false;
}
