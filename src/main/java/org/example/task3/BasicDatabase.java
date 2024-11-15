package org.example.task3;

class BasicDatabase extends Database {
    public BasicDatabase(DatabaseImplementation implementation) {
        super(implementation);
    }

    @Override
    public void openConnection() {
        implementation.connect();
    }

    @Override
    public void runQuery(String query) {
        implementation.executeQuery(query);
    }

    @Override
    public void closeConnection() {
        implementation.disconnect();
    }
}
