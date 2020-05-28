package com.company;

public class DeluxeBurger extends Hamburger {
    private int drink;
    private int chips;

    public DeluxeBurger() {
        super("Deluxe Burger", "Potatoe Bun");
        this.price = 7.00;
        this.drink = 1;
        this.chips = 1;
    }

    public void calculateTotal() {
        double total = 3.00;
        System.out.println("Deluxe includes 1 soda at 2.00 and 1 Chips at 1.00");
        super.calculateTotal(total);
    }
}
