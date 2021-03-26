package com.basics.dp.template;

public abstract class Coffee {

    public  void boilWater()
    {
        System.out.println(("Water Boild"));
    }
    public  void addMilk()
    {
        System.out.println(("Milk Added"));
    }
    public  void addSugar()
    {
        System.out.println(("Sugar Added"));
    }

    // PrepareCoffee method is the template method
    public void prepareCoffee()
    {
        boilWater();
        addMilk();
        addSugar();
        addCoffeePowder();
        //Console.WriteLine(this.GetType().Name + " is Ready");
    }

    public abstract void addCoffeePowder();

}
