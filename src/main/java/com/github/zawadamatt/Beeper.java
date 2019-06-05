package com.github.zawadamatt;

import java.time.LocalTime;
import java.util.UUID;

public class Beeper  {

    private LocalTime orderTime;
    private String uuid = UUID.randomUUID().toString();
    private LocalTime beepTime;
    private LocalTime recevivedTime;
    private String orderDescription;

    public Beeper(){
        this.orderTime = LocalTime.now();
        orderDescription = "Zamownienie numer " + uuid;
    }

    public void setBeepTime(LocalTime beepTime) {
        this.beepTime = beepTime;
        System.out.println(beepTime);
    }

    public void setRecevivedTime(LocalTime recevivedTime) {
        this.recevivedTime = recevivedTime;
    }

    public String getUuid() {
        return uuid;
    }
}
