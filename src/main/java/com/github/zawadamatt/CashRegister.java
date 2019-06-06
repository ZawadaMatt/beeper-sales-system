package com.github.zawadamatt;

import java.util.Scanner;

public class CashRegister {

    public void newOrder(Menager menager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Złóż zamównienie");
        String userInput = sc.nextLine();
        Beeper beeper = new Beeper(userInput);
        System.out.println("Przyjęto zamównienie !");
        menager.newOrder(beeper);
    }

}
