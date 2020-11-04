package org.piotr.lesson6.objects.shop;
import java.math.BigDecimal;

public class Product {
    enum Category {
        TV, RADIO , FRIDGE
    }
    private BigDecimal price;
    private String name;
    private String brand;
    private Category category;

    public Product(BigDecimal price, String name, String brand, Category category) {
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.category = category;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category=" + category +
                '}';
    }
}
