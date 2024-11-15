package org.example.task5;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product phone = new Product("Смартфон", 700.00);
        Product laptop = new Product("Ноутбук", 1200.00);

        // Создание пользователей
        User alice = new User("Алиса");
        User bob = new User("Боб");

        // Создание магазина и добавление продуктов
        Store store = new Store();
        store.addProduct(phone);
        store.addProduct(laptop);

        // Подписка пользователей на уведомления о снижении цены
        store.subscribeToProduct(alice, phone);
        store.subscribeToProduct(bob, laptop);
        store.subscribeToProduct(alice, laptop);

        // Изменение цен на товары
        phone.setPrice(650.00);   // Уведомление для Алисы
        laptop.setPrice(1100.00); // Уведомление для Алисы и Боба
    }
}
