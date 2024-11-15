package org.example.task3;

abstract class Database {
    protected DatabaseImplementation implementation;

    public Database(DatabaseImplementation implementation) {
        this.implementation = implementation;
    }

    public abstract void openConnection();
    public abstract void runQuery(String query);
    public abstract void closeConnection();
}
