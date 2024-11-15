package org.example.task6;

public class Main {
    public static void main(String[] args) {
        Document textDoc = new TextDocument();
        Document graphicDoc = new GraphicDocument();
        Document spreadsheetDoc = new SpreadsheetDocument();

        System.out.println("=== Обработка текстового документа ===");
        textDoc.processDocument();

        System.out.println("\n=== Обработка графического документа ===");
        graphicDoc.processDocument();

        System.out.println("\n=== Обработка табличного документа ===");
        spreadsheetDoc.processDocument();
    }
}
