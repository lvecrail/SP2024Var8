package org.example.task1;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрики для каждого типа мебели
        FurnitureFactory chairFactory = new ChairFactory();
        FurnitureFactory tableFactory = new TableFactory();
        FurnitureFactory cabinetFactory = new CabinetFactory();

        // Создаем объекты мебели с помощью фабрик
        Furniture chair = chairFactory.createFurniture();
        Furniture table = tableFactory.createFurniture();
        Furniture cabinet = cabinetFactory.createFurniture();

        // Описание каждой мебели
        chair.describe();   // Вывод: Это стул.
        table.describe();   // Вывод: Это стол.
        cabinet.describe(); // Вывод: Это шкаф.
    }
}