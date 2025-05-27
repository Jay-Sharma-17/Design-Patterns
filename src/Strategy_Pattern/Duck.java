package Strategy_Pattern;

import Strategy_Pattern.Interface.FlyBehavior;

abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck(){

    }
    //FlyBehavior
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    //Common methods
    abstract void display();
    public void swim(){
        System.out.println("All ducks float");
    }
}
