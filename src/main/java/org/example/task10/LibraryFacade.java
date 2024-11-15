package org.example.task10;

class LibraryFacade {
    private BookSearch bookSearch;
    private BookOrder bookOrder;
    private BookAvailability bookAvailability;

    public LibraryFacade() {
        // Инициализация всех подсистем
        bookSearch = new BookSearch();
        bookOrder = new BookOrder();
        bookAvailability = new BookAvailability();
    }

    public void searchAndOrderBook(String bookTitle) {
        // Проверка наличия книги
        if (bookAvailability.checkAvailability(bookTitle)) {
            // Поиск книги
            bookSearch.searchBook(bookTitle);
            // Оформление заказа
            bookOrder.orderBook(bookTitle);
        } else {
            System.out.println("The book is not available.");
        }
    }
}
