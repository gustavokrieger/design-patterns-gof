package structural.bridge.implementation;

import structural.bridge.implementation.participants.*;

class Main {
    public static void main(String[] args) {
        Implementor concreteImplementorA = new ConcreteImplementorA();
        Abstraction refinedAbstraction = new RefinedAbstraction(concreteImplementorA);
        refinedAbstraction.operation();

        Implementor concreteImplementorB = new ConcreteImplementorB();
        refinedAbstraction.setImp(concreteImplementorB);
        refinedAbstraction.operation();
    }
}
