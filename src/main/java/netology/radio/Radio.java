package netology.radio;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
    }

    Radio() {
        this.maxStation = 10;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            setCurrentVolume(currentVolume);
        }
    }
}