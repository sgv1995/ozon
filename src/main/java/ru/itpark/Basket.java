package ru.itpark;

public class Basket {
    private int amount;
    private int fullPrice;
    private int discountPrice;
    private int discount;
    private double interestCalculation = 0.01;

    public int getAmount() { return amount; }
    public int getFullPrice() { return fullPrice; }
    public int getDiscountPrice() { return discountPrice; }
    public int getDiscount() {
        return discount;
    }

    public void add(Product product) {
        if (product.getAvailable() == true) {
            amount++;
            fullPrice += product.getFullPrice();
            discount += Math.ceil(product.getFullPrice() * (product.getDiscountPercentage() * interestCalculation));
            discountPrice += product.getFullPrice() - Math.ceil((product.getFullPrice() * (product.getDiscountPercentage() * interestCalculation)));
            product.setAvailable(false);
        } else
            return;
    }

    public void delete(Product product) {
        amount--;
        fullPrice -= product.getFullPrice();
        discount -= Math.ceil(product.getFullPrice() * (product.getDiscountPercentage() * interestCalculation));
        discountPrice -= product.getFullPrice() - Math.ceil((product.getFullPrice() * (product.getDiscountPercentage() * interestCalculation)));
        product.setAvailable(true);

    }
}
