package behavioral.strategy.implementation.participants;

public class ConcreteStrategyC implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Called \"algorithmInterface()\" implemented at \"ConcreteStrategyC\".");
    }
}
