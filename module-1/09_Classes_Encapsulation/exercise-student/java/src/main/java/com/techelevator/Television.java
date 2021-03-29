package com.techelevator;

public class Television {
    private boolean isOn = false; //instancing variables
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        isOn = false;
    }

    public void turnOn() { //used to turn on the TV and set it to it's default values
        isOn = true;
        currentVolume = 2;
        currentChannel = 3;
    }

    public void changeChannel(int newChannel) { //allows for changing a channel within the appropriate range
        if(isOn && newChannel < 18 && newChannel > 3) {
            currentChannel = newChannel;
        }

    }

    public void channelUp() { //a method to be able to increase the channel by one within a range
        if (isOn) { //making sure the TV is on
            if (currentChannel == 18) { //this allows for wrapping around to the beginning once the user reaches the top channel
                currentChannel = 3;
            } else {
                currentChannel += 1;
            }

        }
    }

    public void channelDown() { //a method to be able to decrease the channel by one within a range
        if (isOn) { //making sure the TV is on
            if (currentChannel == 3) { //this allows for wrapping around to the end once the user reaches the bottom channel
                currentChannel = 18;
            } else {
                currentChannel -= 1;
            }
        }
    }

    public void raiseVolume() { //a method to increase the volume by one (if the TV is on)
        if (isOn && currentVolume < 10) { //the user cannot go higher than 10
            currentVolume += 1; //incrementing
        }
    }

    public void lowerVolume() { //a method to decrease the volume by one (if the TV is on)
        if (isOn && currentVolume > 0) { //the user cannot go lower than 0
            currentVolume -= 1; //decreasing currentVolume by one
        }
    }

}