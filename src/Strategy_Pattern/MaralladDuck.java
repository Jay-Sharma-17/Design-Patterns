package Strategy_Pattern;

class MaralladDuck extends Duck{
    public MaralladDuck(){
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I am marallad Duck");
    }
}
