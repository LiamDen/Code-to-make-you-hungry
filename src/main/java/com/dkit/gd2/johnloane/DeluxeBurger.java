package com.dkit.gd2.johnloane;

public class DeluxeBurger extends Hamburger
{
    final int MAX_TOPPINGS_FOR_HEALTHY_BURGER = 0;
    public DeluxeBurger(String name, String meat, double price, String breadRollType)
    {
        super(name, meat, price, breadRollType);
    }

    protected void addTopping(String name, double price)
    {
        Topping addedTopping = new Topping(name, price);
        if(this.getToppings().size() < MAX_TOPPINGS_FOR_HEALTHY_BURGER)
        {
            this.getToppings().add(addedTopping);
        }
        else
        {
            System.out.println("Only 6 toppings allowed. Maxed out on toppings");
        }
    }
}
