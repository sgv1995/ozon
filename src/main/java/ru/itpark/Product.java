 package ru.itpark;

 public class Product {
     private int id;
     private String name;
     private String description;
     private int fullPrice;
     private int discountPercentage;
     private int rating;
     private String imageUrl;
     private boolean available;


     public Product(int id, String name, String description, int fullPrice, int discountPercentage, int rating, String imageUrl, boolean available) {
         this.id = id;
         this.name = name;
         this.description = description;
         this.fullPrice = fullPrice;
         this.discountPercentage = discountPercentage;
         this.rating = rating;
         this.imageUrl = imageUrl;
         this.available = available;
     }

     public int getFullPrice() {
        return fullPrice;
    }
     public int getDiscountPercentage() {
        return discountPercentage;
    }
     public boolean getAvailable() { return available; }
     public void setAvailable(boolean available) { this.available = available; }
 }
