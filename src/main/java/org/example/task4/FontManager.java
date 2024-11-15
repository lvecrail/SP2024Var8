package org.example.task4;

class FontManager {
    private FontRenderer fontRenderer;

    public FontManager(FontRenderer fontRenderer) {
        this.fontRenderer = fontRenderer;
    }

    public void displayText(String text) {
        fontRenderer.renderText(text);
    }
}
