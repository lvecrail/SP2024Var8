package org.example.task9;

class WindowManager {
    private Window[] windows;
    private int windowCount;

    public WindowManager(int maxWindows) {
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

    public void displayAllWindows() {
        for (int i = 0; i < windowCount; i++) {
            windows[i].display();
        }
    }

    public void closeAllWindows() {
        for (int i = 0; i < windowCount; i++) {
            windows[i].close();
        }
    }
}
