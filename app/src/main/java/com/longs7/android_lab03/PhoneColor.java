package com.longs7.android_lab03;

public class PhoneColor {
    private int image;
    private String color;
    private String supplier;
    private String price;

    public PhoneColor(int image, String color, String supplier, String price) {
        this.image = image;
        this.color = color;
        this.supplier = supplier;
        this.price = price;
    }

    public PhoneColor() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PhoneColor{" +
                "image=" + image +
                ", color='" + color + '\'' +
                ", supplier='" + supplier + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
