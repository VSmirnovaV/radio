import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Тестирование работы со звуком
    @Test
    public void soundShouldBeSet() { //установка громкости
        Radio radio = new Radio();
        radio.setSoundVolume(50);

        int expected = 50;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldBeSetInvalidSound() { //установка недопустимой громкости(граничные значения)
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldBeSetInvalidSound101() { //установка недопустимой громкости(граничные значения)
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void soundShouldBeSetMin() { //установка минимального звука
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void soundShouldBeSetMax() { // установка максимального звука
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAddSound() { // увеличение громкости на 1
        Radio radio = new Radio();
        radio.setSoundVolume(18);

        radio.increaseVolume();

        int expected = 19;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddSound100() { // увеличение максимальной громкости на 1
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSound99() { // увеличение громкости на 1 (граничное значение)
        Radio radio = new Radio();
        radio.setSoundVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSound1() { // увеличение минимальной громкости на 1 (граничное значение)
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSoundBeTurnedDown() { // уменьшение громкости на 1
        Radio radio = new Radio();
        radio.setSoundVolume(50);

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundBeTurnedDown0() { // уменьшение минимальной громкости на 1
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundBeTurnedDown1() { // уменьшение громкости на 1 (граничное значение)
        Radio radio = new Radio();
        radio.setSoundVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundBeTurnedDown100() { // уменьшение громкости на 1 (граничное значение)
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    //Тестирование работы радиостанций

    @Test
    public void shouldBeSetRadioStation() {// выбор станции радио
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectingInvalidRadioStation() {// выбор  недопустимой станции радио (граничное значение)
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectingInvalidStation() {// выбор  недопустимой станции радио (граничное значение)
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeSetMaxRadioStation() {// выбор максимально допустимой станции радио
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextStation() {// переключение на станцию вперед
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxStation() {// переключение максимально допустимой станции вперед
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMinStation() {// переключение с минимально допустимой станции радио вперед (граничные значения)
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextStationMax() {// переключение на максимально допустимую станцию радио вперед (граничные значения)
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevStation() {// переключение cтанции радио назад
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevMaxStation() {// переключение максимально допустимой cтанции радио назад
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevMinStation() {// переключение минимальной cтанции радио назад
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldChangePrevStation1() {// переключение допустимой cтанции радио назад (граничные знаечения)
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
