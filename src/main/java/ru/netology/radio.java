package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > getMaxStation() || currentStation < getMinStation()) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > getMaxVolume() || currentVolume < getMinVolume()) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }


    public void increaseCurrentStation() {
        if (currentStation >= maxStation) {
            currentStation = 0;
            return;
        }
        this.currentStation++;
    }


    public void decreaseCurrentStation() {
        if (currentStation <= minStation) {
            currentStation = 9;
            return;
        }
        this.currentStation--;
    }


    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = 10;
            return;
        }
        this.currentVolume++;
    }


    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = 0;
            return;
        }
        this.currentVolume--;
    }

}
