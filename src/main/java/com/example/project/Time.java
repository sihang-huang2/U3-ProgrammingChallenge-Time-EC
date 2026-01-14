package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hour;
    private int minute;
    private int second;

    private void parseTime() {
        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }
        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }
        if (hour >= 24) {
            hour = hour % 24;
        }
    }

    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        parseTime();
    }

    //GETTERS
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

    public String info(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }


    public void tick(){
      this.second += 1;
      parseTime();
    }


    public void add(Time time2){
       int hours = this.hour + time2.getHour();
       int minutes = this.minute + time2.getMinute();
       int seconds = this.second + time2.getSecond();
       this.hour = hours;
       this.minute = minutes;
       this.second = seconds;
       parseTime();
    }
}

