package org.example.task7;

class GraphicBuilder {
    private int radius;
    private int width, height;
    private int x, y, x1, y1, x2, y2;
    private String color;
    private String shapeType;

    public GraphicBuilder setCircle(int radius, String color, int x, int y) {
        this.shapeType = "Circle";
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
        return this;
    }

    public GraphicBuilder setRectangle(int width, int height, String color, int x, int y) {
        this.shapeType = "Rectangle";
        this.width = width;
        this.height = height;
        this.color = color;
        this.x = x;
        this.y = y;
        return this;
    }

    public GraphicBuilder setLine(int x1, int y1, int x2, int y2, String color) {
        this.shapeType = "Line";
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        return this;
    }

    public Graphic build() {
        if ("Circle".equals(shapeType)) {
            return new Circle(radius, color, x, y);
        } else if ("Rectangle".equals(shapeType)) {
            return new Rectangle(width, height, color, x, y);
        } else if ("Line".equals(shapeType)) {
            return new Line(x1, y1, x2, y2, color);
        }
        return null;
    }
}
