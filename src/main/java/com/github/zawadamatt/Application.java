package com.github.zawadamatt;

import java.util.Scanner;
import java.util.Timer;

public class Application {

    public static void main(String[] args) {

        Menager menager = new Menager();
        Kitchen kitchen = new Kitchen(menager);
        menager.setKitchen(kitchen);
        CashRegister cashRegister = new CashRegister();
        PreparationOfMeals preparationOfMeals = new PreparationOfMeals();
        preparationOfMeals.setKitchen(kitchen);
        Timer timer = new Timer();
        timer.schedule(preparationOfMeals, 0, 10000);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Wcisnij aby dodac nowe zamównienie");
            String userInput = sc.nextLine();
            cashRegister.newOrder(menager);
        }


    }
}