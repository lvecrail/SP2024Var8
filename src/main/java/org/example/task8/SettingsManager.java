package org.example.task8;

class SettingsManager {
    private SettingsMemento savedSettings;

    // Сохраняет текущие настройки в снимок
    public void saveSettings(Settings settings) {
        this.savedSettings = settings.createMemento();
    }

    // Восстанавливает настройки из снимка
    public void restoreSettings(Settings settings) {
        if (savedSettings != null) {
            settings.restoreMemento(savedSettings);
        } else {
            System.out.println("Снимок не сохранен.");
        }
    }
}
