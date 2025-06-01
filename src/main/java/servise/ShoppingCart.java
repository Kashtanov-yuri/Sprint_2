package servise;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalPrice(){
        double price = 0;

        for (Food item : items) {
            price += item.getPrice() * item.getAmount();
        }

        return price;
    }




    public double totalPriceDiscount(){
        double price = 0;

        for (Food item : items) {
            double discount = (100 - item.getDiscount()) / 100.0;
            price += item.getPrice() * item.getAmount() * discount;
        }
        return price;
    }




    public double totalVegPrice() {
        double price = 0;

        for (Food item : items) {
            if (item.isVegetarian()) {
                price += item.getPrice() * item.getAmount();
            }
        }


        return price;
    }
}
