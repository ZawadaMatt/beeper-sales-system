package com.github.zawadamatt;


public class Kitchen {

    Menager menager;
    PreparationOfMeals preparationOfMeals = new PreparationOfMeals();


    public Kitchen(Menager menager) {
        this.menager = menager;
    }

    public void doOrder(Beeper beeper) {
        preparationOfMeals.orderToPrepare(beeper);
    }

    public void orderReady(Beeper beeper) {
        menager.orderReady(beeper);
    }
}
