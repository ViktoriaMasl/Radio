package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForIncreaseStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldIncreaseCurrentStation(int currentStation, int minStation, int maxStation, int expected) {
        Radio radio = new Radio();
        radio.setMaxStation(maxStation);
        radio.setMinStation(minStation);
        radio.setCurrentStation(currentStation);
        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForDecreaseStation.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldDecreaseCurrentStation(int currentStation, int minStation, int maxStation, int expected) {
        Radio radio = new Radio();
        radio.setMaxStation(maxStation);
        radio.setMinStation(minStation);
        radio.setCurrentStation(currentStation);
        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForIncreaseVolume.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldIncreaseCurrentVolume(int currentVolume, int minVolume, int maxVolume, int expected) {
        Radio radio = new Radio();
        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);
        radio.setCurrentVolume(currentVolume);
        radio.increaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DataForDecreaseVolume.csv", delimiter = '|', numLinesToSkip = 2)
    void shouldDecreaseCurrentVolume(int currentVolume, int minVolume, int maxVolume, int expected) {
        Radio radio = new Radio();
        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);
        radio.setCurrentVolume(currentVolume);
        radio.decreaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}

