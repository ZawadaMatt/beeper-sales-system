package com.github.zawadamatt;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class PreparationOfMeals extends TimerTask {

    private Kitchen kitchen;
    private static List<Beeper> list = new ArrayList<>();

    public void orderToPrepare(Beeper beeper) {
        this.list.add(beeper);
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println("Zamownien w przygotowaniu :" + list.size());
        for (Beeper beeper : list) {
                list.remove(beeper);
                kitchen.orderReady(beeper);
                return;
            }
        }
    }
