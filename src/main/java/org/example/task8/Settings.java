package org.example.task8;

class Settings {
    private String theme;
    private int volume;
    private int brightness;

    public Settings(String theme, int volume, int brightness) {
        this.theme = theme;
        this.volume = volume;
        this.brightness = brightness;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Settings [theme=" + theme + ", volume=" + volume + ", brightness=" + brightness + "]";
    }

    // Метод для создания снимка текущих настроек
    public SettingsMemento createMemento() {
        return new SettingsMemento(this.theme, this.volume, this.brightness);
    }

    // Метод для восстановления настроек из снимка
    public void restoreMemento(SettingsMemento memento) {
        this.theme = memento.getTheme();
        this.volume = memento.getVolume();
        this.brightness = memento.getBrightness();
    }
}
