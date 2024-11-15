package org.example.task9;

class TextWindow implements Window {
    private String content;

    public TextWindow(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Displaying Text Window with content: " + content);
    }

    @Override
    public void close() {
        System.out.println("Closing Text Window");
    }
}

class ImageWindow implements Window {
    private String imagePath;

    public ImageWindow(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        System.out.println("Displaying Image Window with image: " + imagePath);
    }

    @Override
    public void close() {
        System.out.println("Closing Image Window");
    }
}
