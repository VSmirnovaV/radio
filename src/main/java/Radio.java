public class Radio {
    private int soundVolume;
    private int currentRadioStationNumber;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    //Звук
    public int getSoundVolume() {

        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume - 1;
        }
        if (soundVolume <= 0) {
            soundVolume = 0;
        }
        if (soundVolume == 100) {
            soundVolume = 99;
        }
    }

    //Станции Радио
    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getMaxRadioStation() {
        setCurrentRadioStationNumber(minRadioStation);
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        setCurrentRadioStationNumber(maxRadioStation);
        return minRadioStation;
    }

    public void nextStation() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevStation() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 8;
        }
    }
}






