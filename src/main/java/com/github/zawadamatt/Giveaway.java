package com.github.zawadamatt;

import java.time.LocalTime;

public class Giveaway {


    public void callClinet(Beeper beeper){
        System.out.println("Zamównie o numerze  " + beeper.getUuid() + "do odebrania !");
        System.out.println("Godzina dzwonienia beepera : ");
        beeper.setBeepTime(LocalTime.now());
        orderRecevived(beeper);
    }

    public void orderRecevived(Beeper beeper){
        System.out.println("Zamowienie odebrane !");
        beeper.setRecevivedTime(LocalTime.now());
    }
}
