package Decorator_Pattern;

public class OrderPizza {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Margreita());
        System.out.println(pizza.cost());

        BasePizza pizza1 = new Mushroom(new FarmHouse());
        System.out.println(pizza1.cost());
    }
}
