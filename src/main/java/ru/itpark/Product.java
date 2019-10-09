package ru.itpark;

public class Product {
    private int id;
    private String name;
    private String description;
    private int fullPrice;
    private int discountPrice;
    private int discountPercentage;
    private int rating;
    private String imageUrl;
    private boolean available;

    public Product(int id, String name, String description, int fullPrice, int discountPrice, int discountPercentage, int rating, String imageUrl, boolean available) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fullPrice = fullPrice;
        this.discountPrice = discountPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
