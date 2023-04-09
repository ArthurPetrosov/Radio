package org.example.RadioNetology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    void changeStation() {
        radio.setCurrentStation(0);
        radio.setCurrentStation(-1);
        radio.setCurrentStation(11);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void overMinStation() {
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void overMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    void nextStation() {
        radio.setCurrentStation(0);
        radio.next();
        assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(10);
        radio.next();
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        radio.next();
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(11);
        radio.next();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(2);
        radio.prev();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void maxStation() {
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    void maxStation2() {
        radio.setMaxStation(-1);
        radio.setMaxStation(0);
        radio.setMaxStation(11);
        assertEquals(11, radio.getMaxStation());
    }

    @Test
    void minStation() {
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void minStation2() {
        radio.setMinStation(-1);
        radio.setMinStation(0);
        radio.setMinStation(11);
        assertEquals(11, radio.getMinStation());
    }

    @Test
    void changeVolume() {
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());

        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void upVolume() {
        radio.setCurrentVolume(50);
        radio.upperVolume();
        assertEquals(51, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.upperVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    void downVolume() {
        radio.setCurrentVolume(50);
        radio.downVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void maxVolume() {
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void minVolume() {
        radio.setMaxVolume(100);
        radio.setMinVolume(1);
        assertEquals(1, radio.getMinVolume());
    }

}
