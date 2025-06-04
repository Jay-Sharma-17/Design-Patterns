package Decorator_Pattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public double cost(){
        return this.basePizza.cost() + 50;
    }
}
