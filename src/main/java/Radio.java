public class Radio {
    public int soundVolume;
    public int currentRadioStationNumber;

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
        if (soundVolume <= 100) {
            soundVolume = soundVolume - 1;
        }
        if (soundVolume <= 0) {
           soundVolume = 0;
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

    public void nextStation() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        }
    }

    public void prevStation() {
        if (0 < currentRadioStationNumber && currentRadioStationNumber < 10) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

        public void prev0() {
        int stationAfter = 9;
        setCurrentRadioStationNumber(stationAfter);
        }
    }




