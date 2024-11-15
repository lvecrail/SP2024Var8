package org.example.task5;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, double newPrice) {
        System.out.println("Уважаемый " + name + ", цена на " + productName + " снизилась до " + newPrice + "!");
    }
}
