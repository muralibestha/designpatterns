package com.basics.dp.template;

public class Consumer {
    public static void main(String[] args) {
        Coffee bruCoffee=CoffeeFactory.getInstance("bru");
        bruCoffee.prepareCoffee();
       Coffee nesCoffee=CoffeeFactory.getInstance("nescafe");
       nesCoffee.prepareCoffee();
        Coffee sunriseCoffee=CoffeeFactory.getInstance("sun");
        sunriseCoffee.prepareCoffee();
    }
}
