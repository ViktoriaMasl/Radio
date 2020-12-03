package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

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
