package src.poo;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    public Date expirationDate;

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
