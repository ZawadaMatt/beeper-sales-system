package com.github.zawadamatt;

import java.time.LocalTime;
import java.util.UUID;

public class Beeper  {

    private LocalTime orderTime;
    private String uuid = UUID.randomUUID().toString();
    private LocalTime beepTime;
    private LocalTime recevivedTime;
    private String orderDescription;
    private boolean inPreparation = true;

    public Beeper(String orderDescription){
        this.orderTime = LocalTime.now();
        this.orderDescription = orderDescription;
    }

    public void setBeepTime(LocalTime beepTime) {
        this.beepTime = beepTime;
        System.out.println(beepTime);
    }

    public boolean isInPreparation() {
        return inPreparation;
    }

    public void setInPreparation(boolean inPreparation) {
        this.inPreparation = inPreparation;
    }

    public void setRecevivedTime(LocalTime recevivedTime) {
        this.recevivedTime = recevivedTime;
    }

    public String getUuid() {
        return uuid;
    }

    public LocalTime getBeepTime() {
        return beepTime;
    }
}
