package src.poo.principal;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    public Date expirationDate;

    public Item () {
    }

    public Item (String name) {
        this.name = name;
    }

    public Item (String name, Double price, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public Double getTotalToPay() {
        return price + tax;
    }

    public void calculateTax(){
        tax = price * 0.19;
    }

    public Boolean canItBeSold() {
        Date today = new Date();
        return expirationDate.after(today);
    }
}
