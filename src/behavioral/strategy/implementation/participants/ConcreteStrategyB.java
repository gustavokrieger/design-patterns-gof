package behavioral.strategy.implementation.participants;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Called \"algorithmInterface()\" implemented at \"ConcreteStrategyB\".");
    }
}
