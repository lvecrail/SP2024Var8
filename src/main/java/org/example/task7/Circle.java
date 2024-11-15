package org.example.task7;

class Circle implements Graphic {
    private int radius;
    private String color;
    private int x, y;

    public Circle(int radius, String color, int x, int y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с радиусом " + radius + ", цветом " + color + " на координатах (" + x + ", " + y + ")");
    }
}