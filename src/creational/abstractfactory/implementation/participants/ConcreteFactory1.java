package creational.abstractfactory.implementation.participants;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA1 createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB1 createProductB() {
        return new ProductB1();
    }
}
