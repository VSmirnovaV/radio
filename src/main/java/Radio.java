public class Radio {
    private int soundVolume;
    private int currentRadioStationNumber;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int maxStation;

    public Radio () {
        maxStation = 9;
    }

    public Radio (int radioStationNumber) {
        maxStation = radioStationNumber - 1;
    }

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
        if (newCurrentRadioStationNumber > maxStation) {
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
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevStation() {
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        if (currentRadioStationNumber == maxStation) {
            currentRadioStationNumber = 8;
        }
    }
}






