package org.example.task8;

class SettingsMemento {
    private String theme;
    private int volume;
    private int brightness;

    public SettingsMemento(String theme, int volume, int brightness) {
        this.theme = theme;
        this.volume = volume;
        this.brightness = brightness;
    }

    public String getTheme() {
        return theme;
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }
}
