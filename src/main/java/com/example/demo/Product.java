package com.example.demo;

public class Product {
    private String productId;
    private String productName;
    private String unitOfMeasure;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product(String productId, String productName, String unitOfMeasure, String status) {
        this.productId = productId;
        this.productName = productName;
        this.unitOfMeasure = unitOfMeasure;
        this.status = status;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

}
