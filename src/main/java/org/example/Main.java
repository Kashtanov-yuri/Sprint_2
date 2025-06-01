package org.example;


import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import servise.ShoppingCart;

import java.awt.*;

import static java.awt.Color.green;
import static java.awt.Color.red;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.RED);
        Apple appleGreen = new Apple(8, 60, Colour.GREEN);
        Apple invalidApple = new Apple(8, 60, null);

        Food[] items = {meat, appleRed, appleGreen, invalidApple};
        var cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.totalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + cart.totalPriceDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.totalVegPrice());
    }
}