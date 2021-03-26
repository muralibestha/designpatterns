package com.basics.dp.template;

public class CoffeeFactory {

    public static Coffee getInstance(String flavour){
        if(flavour.equalsIgnoreCase("bru")){
            return new BruCoffee();
        }else if(flavour.equalsIgnoreCase("nescafe")){
            return new Nescafe();
        }else {
            System.out.println("flavour = " + flavour+" not available");
            throw new IllegalArgumentException("Sorry = " + flavour+" flavour not available");
        }
    }
}
