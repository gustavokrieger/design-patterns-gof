package structural.bridge.implementation.participants;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImp() {
        System.out.println("Called \"operationImp()\" implemented in \"ConcreteImplementorB\".");
    }
}
