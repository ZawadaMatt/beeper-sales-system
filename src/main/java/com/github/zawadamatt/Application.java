package com.github.zawadamatt;

import java.util.Scanner;
import java.util.Timer;

public class Application {

    public static void main(String[] args) {

        Menager menager = new Menager();
        Kitchen kitchen = new Kitchen(menager);
        CashRegister cashRegister = new CashRegister();
        Timer timer = new Timer();

        PreparationOfMeals preparationOfMeals = new PreparationOfMeals();
        menager.setKitchen(kitchen);
        preparationOfMeals.setKitchen(kitchen);

        timer.schedule(preparationOfMeals, 0, 20000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Wcisnij aby dodac nowe zamównienie");
            System.out.println("Wcisnij q aby wyjść");
            String userInput = sc.nextLine();
            if (userInput.equals("q")) {
                System.exit(0);
            }
            cashRegister.newOrder(menager);
        }
    }
}