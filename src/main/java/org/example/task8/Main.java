package org.example.task8;

public class Main {
    public static void main(String[] args) {
        // Создание объекта настроек
        Settings userSettings = new Settings("Dark Mode", 50, 75);
        System.out.println("Текущие настройки: " + userSettings);

        // Менеджер снимков
        SettingsManager settingsManager = new SettingsManager();

        // Сохраняем текущие настройки
        settingsManager.saveSettings(userSettings);

        // Изменяем настройки
        userSettings.setTheme("Light Mode");
        userSettings.setVolume(80);
        userSettings.setBrightness(90);
        System.out.println("Измененные настройки: " + userSettings);

        // Восстанавливаем настройки из снимка
        settingsManager.restoreSettings(userSettings);
        System.out.println("Восстановленные настройки: " + userSettings);
    }
}
