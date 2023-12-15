package model;



import lombok.*;
import model.enums.OrderStatus;
import model.enums.PaymentMethod;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private String id;
    private User user;
    private Product product;
    private int qty;
    private Date date;
    private double price;
    private OrderStatus orderStatus;
    private PaymentMethod paymentMethod;


}
