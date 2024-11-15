package org.example.task4;

public class Main {
    public static void main(String[] args) {

        TrueTypeRenderer trueType = new TrueTypeRenderer();
        FontRenderer trueTypeAdapter = new TrueTypeAdapter(trueType);
        FontManager manager1 = new FontManager(trueTypeAdapter);
        manager1.displayText("Hello, TrueType!");

        OpenTypeRenderer openType = new OpenTypeRenderer();
        FontRenderer openTypeAdapter = new OpenTypeAdapter(openType);
        FontManager manager2 = new FontManager(openTypeAdapter);
        manager2.displayText("Hello, OpenType!");
    }
}
