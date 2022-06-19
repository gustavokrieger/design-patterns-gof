package structural.bridge.implementation.participants;

public abstract class Abstraction {
    private Implementor imp;

    Abstraction(Implementor imp) {
        this.imp = imp;
    }

    public void setImp(Implementor imp) {
        this.imp = imp;
    }

    public void operation() {
        imp.operationImp();
    }
}
