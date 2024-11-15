package org.example.task3;

class GraphDatabase implements DatabaseImplementation {
    @Override
    public void connect() {
        System.out.println("Подключение к графовой базе данных.");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Выполнение запроса для графовой базы данных: " + query);
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от графовой базы данных.");
    }
}
