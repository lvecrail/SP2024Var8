package org.example.task3;

class NoSQLDatabase implements DatabaseImplementation {
    @Override
    public void connect() {
        System.out.println("Подключение к NoSQL базе данных.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Выполнение NoSQL запроса: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от NoSQL базы данных.");
    }
}
