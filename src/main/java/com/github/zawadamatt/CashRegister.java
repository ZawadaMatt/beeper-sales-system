package com.github.zawadamatt;

import javax.swing.*;

public class CashRegister {

    public void newOrder(Menager menager) {
        String userInput = JOptionPane.showInputDialog("Co chcesz zamówić ?");
        Beeper beeper = new Beeper(userInput);
        System.out.println("Przyjęto zamównienie !");
        menager.newOrder(beeper);
    }
}