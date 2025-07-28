package ru.netology_java_oop_radio.services;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public void next(){
        if (currentRadioStation < 9) {
            currentRadioStation++;
        }
        else {
            currentRadioStation = 0;
        }
    }
    public void prev(){
        if (currentRadioStation > 0) {
            currentRadioStation--;
        }
        else {
            currentRadioStation = 9;
        }
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

