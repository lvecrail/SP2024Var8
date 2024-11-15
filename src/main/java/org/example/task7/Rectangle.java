package org.example.task7;

class Rectangle implements Graphic {
    private int width, height;
    private String color;
    private int x, y;

    public Rectangle(int width, int height, String color, int x, int y) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник с размерами (" + width + "x" + height + "), цветом " + color + " на координатах (" + x + ", " + y + ")");
    }
}