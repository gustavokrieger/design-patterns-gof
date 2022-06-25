package structural.bridge.implementation.participants;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImp() {
        System.out.println("Called \"operationImp()\" implemented at \"ConcreteImplementorA\".");
    }
}
