package com.github.zawadamatt;

public class Application {

    public static void main(String[] args) {

        Menager menager = new Menager();
        Kitchen kitchen = new Kitchen(menager);
        menager.setKitchen(kitchen);
        CashRegister cashRegister = new CashRegister();

        cashRegister.newOrder(menager);
        cashRegister.newOrder(menager);
        cashRegister.newOrder(menager);
    }
}