package org.example.task1;

class CabinetFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Cabinet();
    }
}