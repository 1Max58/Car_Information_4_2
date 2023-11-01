package com.example.carinformation;

public class Car {
    private String model;
    private String brand;
    private int year;
    private float price;
    private String color;
    private int quantity;

    public Car(String m, String b, int y, float p, String c, int q) {
        model = m;
        brand = b;
        year = y;
        price = p;
        color = c;
        quantity = q;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String m) {
        model = m;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String b) {
        brand = b;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int y) {
        year = y;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float p) {
        price = p;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
    public int getQuantity() {
        return quantity;
    }
}
