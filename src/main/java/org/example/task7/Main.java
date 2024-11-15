package org.example.task7;

public class Main {
    public static void main(String[] args) {
        // Создание объекта с использованием строителя
        GraphicBuilder builder = new GraphicBuilder();

        Graphic circle = builder.setCircle(10, "Red", 50, 50).build();
        circle.draw();

        Graphic rectangle = builder.setRectangle(30, 40, "Blue", 100, 100).build();
        rectangle.draw();

        Graphic line = builder.setLine(0, 0, 200, 200, "Green").build();
        line.draw();
    }
}
