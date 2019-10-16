package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Product legoOldFishingShip = new Product(
                70419,
                "Старый рыбацкий корабль",
                "Конструктор",
                2299,
                32,
                5,
                "https://ozon.ru/70419",
                true
        );
        Product legoOldCemeteryRiddle = new Product(
                70420,
                "Загадка старого кладбища",
                "Конструктор",
                2299,
                33,
                5,
                "https://ozon.ru/70420",
                true
        );
        Product legoStuntTruckElfuego = new Product(
                70421,
                "Трюковой грузовик Эль-Фуэго",
                "Конструктор",
                2999,
                32,
                0,
                "https://ozon.ru/70421",
                true
        );

        Basket basket = new Basket();
        basket.add(legoOldFishingShip);
        basket.add(legoOldCemeteryRiddle);
        basket.add(legoStuntTruckElfuego);

        //Удаление товара из корзины
        basket.delete(legoOldCemeteryRiddle);
        //Проверка, что добавленный товар уже не добавляется в корзину
        basket.add(legoStuntTruckElfuego);

        System.out.println("Полная цена товаров в корзине: " + basket.getFullPrice());
        System.out.println("Цена товаров в корзине с учётом скидки: " + basket.getDiscountPrice());
        System.out.println("Количество товаров в корзине: " + basket.getAmount());
        System.out.println("Общая скидка на товары в корзине: " + basket.getDiscount());
    }
}
