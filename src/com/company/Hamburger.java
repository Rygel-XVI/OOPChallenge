package com.company;

public class Hamburger {
    private String name;
    private String rollType;
    public int lettuce;
    public int tomato;
    public int pickle;
    public boolean ketchup;
    public double price;
    public double total;

    public Hamburger(String name, String rollType) {
        this.name = name;
        this.rollType = rollType;
        this.price = 5.00;
    }

    public String getName() {
        return name;
    }


    public void calculateTotal() {
        double ketchupIncluded = getKetchup() ? 0.10 : 0.00;
        double total = getPrice() + (getLettuce() * 0.25) + (getTomato() * 0.50) + (getPickle() * 0.50) + ketchupIncluded;
        System.out.println(getName() + " total currently: " + total);
        this.setTotal(total);
    }

    public void calculateTotal(double total) {
        double ketchup = getKetchup() ? 0.10 : 0.00;
        total += getPrice() + (getLettuce() * 0.25) + (getTomato() * 0.50) + (getPickle() * 0.50) + ketchup;
        System.out.println(getName() + " total currently: " + total);
        this.setTotal(total);
    }

    public double getPrice() {
        return price;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setPickle(int pickle) {
        this.pickle = pickle;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public void setTotal(double total) { this.total = total; }

    public boolean getKetchup() {
        return ketchup;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getPickle() {
        return pickle;
    }

    public void addLettuce(int amount) {
        setLettuce(amount);
        System.out.println("Added " + amount + " lettuce at 0.25 each.");
    }

    public void addTomato(int amount) {
        setTomato(amount);
        System.out.println("Added " + amount + " tomato at 0.50 each.");
    }

    public void addKetchup() {
        setKetchup(true);
        System.out.println("Added ketchup for 0.10");
    }

    public void addPickles(int amount) {
        setPickle(amount);
        System.out.println("Added " + amount + " pickle(s) at 0.50 each");
    }


}
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.