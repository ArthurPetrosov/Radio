package org.example.RadioNetology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    @Test
    public void setCurrentStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMinus() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationOverLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNorm() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);
        int expected = 3;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume1() {
        Radio rad = new Radio();
        rad.setVolume(0);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume2() {
        Radio rad = new Radio();
        rad.setVolume(100);
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume3() {
        Radio rad = new Radio();
        rad.setVolume(50);
        int expected = 50;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume4() {
        Radio rad = new Radio();
        rad.setVolume(101);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume5() {
        Radio rad = new Radio();
        rad.setVolume(-1);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume6() {
        Radio rad = new Radio();
        rad.setVolume(99);
        int expected = 99;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume7() {
        Radio rad = new Radio();
        rad.setVolume(1);
        int expected = 1;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolume1() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.upVolume();
        int expected = 1;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolume2() {
        Radio rad = new Radio();
        rad.setVolume(99);
        rad.upVolume();
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolume3() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.upVolume();
        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume1() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.downVolume();
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume2() {
        Radio rad = new Radio();
        rad.setVolume(1);
        rad.downVolume();
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume3() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.downVolume();
        int expected = 99;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
