package org.example.task10;

public class Main {
    public static void main(String[] args) {
        // Создаем фасад
        LibraryFacade libraryFacade = new LibraryFacade();

        // Используем фасад для поиска, проверки наличия и оформления заказа
        String bookTitle = "Design Patterns";
        libraryFacade.searchAndOrderBook(bookTitle);
    }
}
