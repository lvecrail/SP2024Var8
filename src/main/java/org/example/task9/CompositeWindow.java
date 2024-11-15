package org.example.task9;

class CompositeWindow implements Window {
    private Window[] windows;
    private int windowCount;

    public CompositeWindow(int maxWindows) {
        windows = new Window[maxWindows];
        windowCount = 0;
    }

    public void addWindow(Window window) {
        if (windowCount < windows.length) {
            windows[windowCount++] = window;
        } else {
            System.out.println("No space to add more windows.");
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying Composite Window with multiple windows:");
        for (int i = 0; i < windowCount; i++) {
            windows[i].display();
        }
    }

    @Override
    public void close() {
        System.out.println("Closing Composite Window:");
        for (int i = 0; i < windowCount; i++) {
            windows[i].close();
        }
    }
}
