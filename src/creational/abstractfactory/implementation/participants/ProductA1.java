package creational.abstractfactory.implementation.participants;

class ProductA1 implements AbstractProductA {
    @Override
    public void operationA() {
        System.out.println("Called \"operationA()\" implemented in \"ProductA1\".");
    }
}
