

//You arebuilding a shopping cart application in Java.
// The application needs to calculate the total cost of all the items in the cart.
// Each item has a price and a quantity. How would you use Java aggregations to calculate the total cost?
package com.knoldus.task6;

class Item {
    private int quantity;
    private double price;

    Item(int quantity, double price){
        setQuantity(quantity);
        setPrice(price);
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

class ShoppingCart{
    private Item schoolBag = new Item(3, 500);
    private Item lunchBox = new Item(5, 100);
    private Item waterBottle = new Item(4, 300);
    private Item pencilBox = new Item(10, 50);

    public double findTotalCost(){
        double totalCost = schoolBag.getQuantity() * schoolBag.getPrice() + lunchBox.getQuantity() * lunchBox.getPrice() + waterBottle.getQuantity() * waterBottle.getPrice() + pencilBox.getQuantity() * pencilBox.getPrice();
        return totalCost;
    }
}



public  class ShoppingCartImplementation{
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart() ;
        System.out.println("Total cost of all the items in the cart : " + shoppingCart.findTotalCost());
    }
}
