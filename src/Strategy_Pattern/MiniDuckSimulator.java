package Strategy_Pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MaralladDuck maralladDuck = new MaralladDuck();
        maralladDuck.display();
        maralladDuck.performFly();

        System.out.println();

        Duck model = new MaralladDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println();

        PowerModelDuck powerModelDuck = new PowerModelDuck();
        powerModelDuck.display();
        powerModelDuck.performFly();
        powerModelDuck.setFlyBehavior(new FlyWithWings());
        powerModelDuck.performFly();
    }
}
