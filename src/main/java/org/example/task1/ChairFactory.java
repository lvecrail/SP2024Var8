package org.example.task1;

class ChairFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}