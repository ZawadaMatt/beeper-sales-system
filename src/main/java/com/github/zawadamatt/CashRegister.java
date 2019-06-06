package com.github.zawadamatt;

import javax.jws.soap.SOAPBinding;

public class CashRegister {

    Menager menager = new Menager();

    public CashRegister() {

    }

    public void newOrder(Menager menager) {
        Beeper beeper = new Beeper("Zamownie ....");
        System.out.println("Przyjęto zamównienie !");
        menager.newOrder(beeper);
    }

}
