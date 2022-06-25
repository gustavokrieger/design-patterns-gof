package creational.abstractfactory.implementation;

import creational.abstractfactory.implementation.participants.*;

class Main {
    public static void main(String[] args) {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        AbstractProductA ProductA1 = concreteFactory1.createProductA();
        ProductA1.operationA();
        AbstractProductB ProductB1 = concreteFactory1.createProductB();
        ProductB1.operationB();

        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        AbstractProductA ProductA2 = concreteFactory2.createProductA();
        ProductA2.operationA();
        AbstractProductB ProductB2 = concreteFactory2.createProductB();
        ProductB2.operationB();
    }
}
