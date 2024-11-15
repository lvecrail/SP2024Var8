package org.example.task3;

public class Main {
    public static void main(String[] args) {
        // SQL Database
        Database sqlDatabase = new BasicDatabase(new SQLDatabase());
        sqlDatabase.openConnection();
        sqlDatabase.runQuery("SELECT * FROM users");
        sqlDatabase.closeConnection();

        // NoSQL Database
        Database noSQLDatabase = new BasicDatabase(new NoSQLDatabase());
        noSQLDatabase.openConnection();
        noSQLDatabase.runQuery("FIND {name: 'John'}");
        noSQLDatabase.closeConnection();

        // Graph Database
        Database graphDatabase = new BasicDatabase(new GraphDatabase());
        graphDatabase.openConnection();
        graphDatabase.runQuery("MATCH (n) RETURN n");
        graphDatabase.closeConnection();
    }
}
