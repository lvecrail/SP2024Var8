package org.example.task4;

class OpenTypeAdapter implements FontRenderer {
    private OpenTypeRenderer openTypeRenderer;

    public OpenTypeAdapter(OpenTypeRenderer openTypeRenderer) {
        this.openTypeRenderer = openTypeRenderer;
    }

    @Override
    public void renderText(String text) {
        openTypeRenderer.renderOpenTypeFont(text);
    }
}
