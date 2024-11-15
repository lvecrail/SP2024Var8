package org.example.task1;

class TableFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}