package netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    public void findStation() {

        Radio st = new Radio();

        st.setCurrentStation(8);

        int actual = st.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findStationMin() {

        Radio st = new Radio();

        st.setCurrentStation(0);

        int actual = st.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findStationMax() {

        Radio st = new Radio();

        st.setCurrentStation(10);

        int actual = st.getCurrentStation();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void findStationBelowMin() {

        Radio st = new Radio();

        st.setCurrentStation(-2);

        int actual = st.getCurrentStation();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findStationAboveMax() {

        Radio st = new Radio();

        st.setCurrentStation(11);

        int actual = st.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void changeStationIncrease() {

        Radio st = new Radio();

        st.setCurrentStation(1);
        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void changeStationIncreaseMax() {

        Radio st = new Radio();

        st.setCurrentStation(10);
        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void changeStationIncreaseAboveMax() {

        Radio st = new Radio();

        st.setCurrentStation(10);
        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationIncreaseMin() {

        Radio st = new Radio();

        st.setCurrentStation(0);
        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseBelowMax() {
        Radio st = new Radio();

        st.setCurrentStation(8);

        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationIncrease123() {
        Radio st = new Radio();

        st.setCurrentStation(20);

        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationReduce() {
        Radio st = new Radio();

        st.setCurrentStation(6);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceMax() {
        Radio st = new Radio();

        st.setCurrentStation(9);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(10);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceMin() {
        Radio st = new Radio();

        st.setCurrentStation(0);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceBelowMin() {
        Radio st = new Radio();

        st.setCurrentStation(-1);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findVolume() {
        Radio vl = new Radio();

        vl.setCurrentVolume(9);

        int actual = vl.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findVolumeMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(10);

        int actual = vl.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findVolumeAboveMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(110);

        int actual = vl.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findVolumeMin() {
        Radio vl = new Radio();

        vl.setCurrentVolume(0);

        int actual = vl.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findVolumeBelowMin() {
        Radio vl = new Radio();

        vl.setCurrentVolume(-1);

        int actual = vl.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncrease() {
        Radio vl = new Radio();

        vl.setCurrentVolume(9);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncreaseMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(100);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncreaseAboveMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(100);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduce() {
        Radio vl = new Radio();

        vl.setCurrentVolume(9);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(100);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceAboveMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(101);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceMin() {
        Radio vl = new Radio();

        vl.setCurrentVolume(0);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetNexStation() {
        Radio st = new Radio();

        st.setCurrentStation(8);

        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetNexStationAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(10);

        st.nextStation();

        int actual = st.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStation() {
        Radio st = new Radio();

        st.setCurrentStation(8);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevStationBelowMin() {
        Radio st = new Radio();

        st.setCurrentStation(0);

        st.prevStation();

        int actual = st.getCurrentStation();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowCurrentStation() {
        Radio st = new Radio();
        st.setCurrentStation(1);

        Assertions.assertEquals(1, st.getCurrentStation());
    }
}


