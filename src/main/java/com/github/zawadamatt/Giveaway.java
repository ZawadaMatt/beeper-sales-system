package com.github.zawadamatt;

import java.time.LocalTime;

public class Giveaway {

    public void callClinet(Beeper beeper) {
        System.out.println();
        System.out.println("Zamównie " + beeper.getOrderDescription() + " do odebrania !");
        System.out.println("Godzina dzwonienia beepera : ");
        beeper.setBeepTime(LocalTime.now());
        orderRecevived(beeper);
    }

    public void orderRecevived(Beeper beeper) {
        beeper.setRecevivedTime(LocalTime.now());
    }

}
