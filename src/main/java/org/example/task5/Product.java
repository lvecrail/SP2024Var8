package org.example.task5;

class Product implements Observable {
    private String name;
    private double price;
    private Observer[] observers = new Observer[10];
    private int observerCount = 0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < this.price) { // Уведомляем только при снижении цены
            this.price = price;
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        if (observerCount < observers.length) {
            observers[observerCount++] = observer;
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        for (int i = 0; i < observerCount; i++) {
            if (observers[i] == observer) {
                observers[i] = observers[--observerCount];
                observers[observerCount] = null;
                break;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerCount; i++) {
            observers[i].update(name, price);
        }
    }
}
