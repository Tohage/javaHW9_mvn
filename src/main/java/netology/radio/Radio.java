package netology.radio;

import lombok.Data;
import lombok.Getter;


@Data
public class Radio {
    private final int numberOfStations;
    @Getter
    private int currentStation;
    @Getter
    private int currentVolume;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    Radio() {
        this.numberOfStations = 10;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = numberOfStations;
        }
        if (currentStation > numberOfStations) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {

        if (currentStation <= 0) {
            setCurrentStation(currentStation);
        }
        currentStation = currentStation + 1;
        if (currentStation > numberOfStations) {
            currentStation = 0;
        }
    }

    public void nextStation() {
        if (currentStation >= numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public void reduceStation() {

        if (currentStation <= 0) {
            currentStation = numberOfStations;
        }
        currentStation -= 1;
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