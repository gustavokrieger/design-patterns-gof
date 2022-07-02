package behavioral.strategy.implementation;

import behavioral.strategy.implementation.participants.*;

public class Main {
    public static void main(String[] args) {
        Strategy concreteStrategyA = new ConcreteStrategyA();
        Context context = new Context(concreteStrategyA);
        context.contextInterface();

        Strategy concreteStrategyB = new ConcreteStrategyB();
        context.setStrategy(concreteStrategyB);
        context.contextInterface();

        Strategy concreteStrategyC = new ConcreteStrategyC();
        context.setStrategy(concreteStrategyC);
        context.contextInterface();
    }
}
