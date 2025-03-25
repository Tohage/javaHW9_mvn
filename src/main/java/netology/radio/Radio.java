package netology.radio;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 9;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {

        if (currentStation <= 0) {
            setCurrentStation(currentStation);
        }
        currentStation = currentStation + 1;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void reduceStation() {

        if (currentStation <= 0) {
            currentStation = 9;
        }
        currentStation -= 1;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            setCurrentVolume(currentVolume);
        }
    }
}