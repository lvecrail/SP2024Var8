package org.example.task4;

class TrueTypeAdapter implements FontRenderer {
    private TrueTypeRenderer trueTypeRenderer;

    public TrueTypeAdapter(TrueTypeRenderer trueTypeRenderer) {
        this.trueTypeRenderer = trueTypeRenderer;
    }

    @Override
    public void renderText(String text) {
        trueTypeRenderer.renderTrueTypeFont(text);
    }
}
