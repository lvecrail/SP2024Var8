package org.example.task5;

class Store {
    private Product[] products = new Product[10];
    private int productCount = 0;

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        }
    }

    public void subscribeToProduct(User user, Product product) {
        product.addObserver(user);
    }

    public void unsubscribeFromProduct(User user, Product product) {
        product.removeObserver(user);
    }
}
