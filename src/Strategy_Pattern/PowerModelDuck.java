package Strategy_Pattern;

class PowerModelDuck extends Duck{

    public PowerModelDuck(){
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    void display() {
        System.out.println("I am power duck");
    }
}
