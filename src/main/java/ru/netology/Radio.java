package ru.netology;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int maxStation, int minStation, int currentStation, int maxVolume, int minVolume, int currentVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseCurrentStation() {
        if (currentStation < maxStation && currentStation >= minStation) {
            this.currentStation++;
            return;
        } else {
            currentStation = minStation;
        }

    }

    public void decreaseCurrentStation() {
        if (currentStation > minStation && currentStation <= maxStation) {
            this.currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }
    }

    public void inputCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        } else if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume && currentVolume >= minVolume) {
            this.currentVolume++;
            return;
        } else if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        } else {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume && currentVolume <= maxVolume) {
            this.currentVolume--;
            return;
        } else if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        } else {
            this.currentVolume = minVolume;
        }
    }

}
