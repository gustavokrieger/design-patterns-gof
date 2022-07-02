package behavioral.strategy.implementation.participants;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Called \"algorithmInterface()\" implemented at \"ConcreteStrategyA\".");
    }
}
