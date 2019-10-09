package ru.itpark;

public class Basket {
    private int amount;
    private int fullPrice;
    private int discountPrice;
    private int discount;
    private double interestCalculation = 0.01;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getInterestCalculation() {
        return interestCalculation;
    }

    public void setInterestCalculation(double interestCalculation) {
        this.interestCalculation = interestCalculation;
    }



    public void add(Product product) {
        if (product.getAvailable() == true) {
            amount++;
            fullPrice += product.getFullPrice();
            discountPrice += product.getDiscountPrice();
            discount += Math.ceil(product.getFullPrice() * (product.getDiscountPercentage() * interestCalculation));
            product.setAvailable(false);
        } else
            return;
    }

    public void delete(Product product) {
        amount--;
        fullPrice -= product.getFullPrice();
        discountPrice -= product.getDiscountPrice();
        discount -= Math.ceil(product.getFullPrice() * (product.getDiscountPercentage() * interestCalculation));
        product.setAvailable(true);

    }
}
