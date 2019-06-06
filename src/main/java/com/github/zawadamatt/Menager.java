package com.github.zawadamatt;

public class Menager {

    private Kitchen kitchen;
    private CashRegister cashRegister;
    Giveaway giveaway = new Giveaway();


    public void newOrder(Beeper beeper){
        kitchen.doOrder(beeper);
    }

    public void orderReady(Beeper beeper){
        giveaway.callClinet(beeper);
    }

    public void orderRecevived(Beeper beeper){
        System.out.println("Zamownienie odebrane ");
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setGiveaway(Giveaway giveaway) {
        this.giveaway = giveaway;
    }
}
