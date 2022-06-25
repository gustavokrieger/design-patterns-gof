package creational.abstractfactory.implementation.participants;

class ProductB1 implements AbstractProductB {
    @Override
    public void operationB() {
        System.out.println("Called \"operationB()\" implemented at \"ProductB1\".");
    }
}
