package org.example.task11;

class GraphicReport implements Report {
    private String title;
    private String imageData;

    public GraphicReport(String title, String imageData) {
        this.title = title;
        this.imageData = imageData;
    }

    // Реализация метода cloneReport
    @Override
    public Report cloneReport() {
        return new GraphicReport(this.title, this.imageData);
    }

    @Override
    public void displayReport() {
        System.out.println("Graphic Report - Title: " + title);
        System.out.println("Image Data: " + imageData);
    }
}
