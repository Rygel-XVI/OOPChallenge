package com.company;

public class HealthyBurger extends Hamburger {
    private int onion;
    private int avocado;

    public HealthyBurger() {
        super("Healthy avocado burger", "Brown Rye Bun");
        this.price = 7.00;
    }

    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public int getAvocado() {
        return avocado;
    }

    public void setAvocado(int avocado) {
        this.avocado = avocado;
    }

    public void addAvocado(int amount) {
        setAvocado(amount);
        System.out.println("Added " + amount + " Avocado at 1.50 each");
    }

    public void addOnion(int amount) {
        setOnion(amount);
        System.out.println("Added " + amount + " Onion at 0.5 each." );
    }

    public void calculateTotal() {
        double total = (getOnion() * 0.5) + (getAvocado() * 1.5);
        super.calculateTotal(total);
    }

}
