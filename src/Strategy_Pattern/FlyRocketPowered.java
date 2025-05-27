package Strategy_Pattern;

import Strategy_Pattern.Interface.FlyBehavior;

class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket power flying");
    }
}