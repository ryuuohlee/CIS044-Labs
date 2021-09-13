/*
Items

Write a class called items taht has member variables name(string), price(double), and quantity(integer). In main program, create an array of type itesm called arrayItem and store severalitem objects in this array.
Note that main should create several item objects and save these objects in arrayItem. Write a static method called totalCost that accepts an array of items. This static method must calculate and return the total cost of items stored in the array.

*/

public class Items{
    public String name;
    public double price;
    public int quantity;

    public Items(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}