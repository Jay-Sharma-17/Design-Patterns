package Decorator_Pattern;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public double cost(){
        return this.basePizza.cost() + 30;
    }
}
