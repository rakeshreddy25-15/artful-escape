package com.artfulescape.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;

    @NotBlank
    private String userId;

    private List<OrderItem> products = new ArrayList<>();

    @NotNull @Min(0)
    private Double totalAmount;

    @NotBlank
    private String status; // CREATED, PAID, FAILED, SHIPPED, DELIVERED

    private String paymentId; // reference to payment

    @CreatedDate
    private Instant date;

    public static class OrderItem {
        private String productId;
        private Integer quantity;
        private Double price;

        public String getProductId() { return productId; }
        public void setProductId(String productId) { this.productId = productId; }
        public Integer getQuantity() { return quantity; }
        public void setQuantity(Integer quantity) { this.quantity = quantity; }
        public Double getPrice() { return price; }
        public void setPrice(Double price) { this.price = price; }
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public List<OrderItem> getProducts() { return products; }
    public void setProducts(List<OrderItem> products) { this.products = products; }
    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }
    public Instant getDate() { return date; }
    public void setDate(Instant date) { this.date = date; }
}
