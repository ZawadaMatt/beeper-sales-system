package com.github.zawadamatt;

public class Kitchen {

    Menager menager;

    public Kitchen(Menager menager) {
        this.menager = menager;
    }

    public void doOrder(Beeper beeper){
        System.out.println("Robie jezenie ");;
        orderReady(beeper);
    }

    public void orderReady(Beeper beeper){
        menager.orderReady(beeper);
    }
}
