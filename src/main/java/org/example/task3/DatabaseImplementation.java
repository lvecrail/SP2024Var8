package org.example.task3;

interface DatabaseImplementation {
    void connect();
    void executeQuery(String query);
    void disconnect();
}