package org.example.task11;

class TextReport implements Report {
    private String title;
    private String content;

    public TextReport(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Реализация метода cloneReport
    @Override
    public Report cloneReport() {
        return new TextReport(this.title, this.content);
    }

    @Override
    public void displayReport() {
        System.out.println("Text Report - Title: " + title);
        System.out.println("Content: " + content);
    }
}
