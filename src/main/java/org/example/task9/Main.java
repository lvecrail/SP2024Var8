package org.example.task9;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько окон
        Window textWindow1 = new TextWindow("Welcome to the text window 1!");
        Window textWindow2 = new TextWindow("Another text window content.");
        Window imageWindow = new ImageWindow("image1.png");

        // Создаем составное окно
        CompositeWindow compositeWindow = new CompositeWindow(3);
        compositeWindow.addWindow(textWindow1);
        compositeWindow.addWindow(imageWindow);

        // Создаем менеджер окон
        WindowManager windowManager = new WindowManager(5);
        windowManager.addWindow(textWindow2);
        windowManager.addWindow(compositeWindow);

        // Отображаем все окна
        windowManager.displayAllWindows();

        // Закрываем все окна
        windowManager.closeAllWindows();
    }
}
