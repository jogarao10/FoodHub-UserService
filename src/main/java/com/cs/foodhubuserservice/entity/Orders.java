package com.cs.foodhubuserservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "user_Name", nullable = false)
    private String userName;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "item_price", nullable = false)
    private Float itemPrice;

    @Column(name = "total_price", nullable = false)
    private Float totalPrice;

    @Column(name = "order_status", nullable = false)
    private String orderStatus;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "order_time", nullable = false)
    private LocalTime orderTime;

    @Column(name = "order_address", nullable = false)
    private String orderAddress;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", itemPrice=" + itemPrice +
                ", totalPrice=" + totalPrice +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                ", orderAddress='" + orderAddress + '\'' +
                '}';
    }
}
