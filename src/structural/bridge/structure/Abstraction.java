package structural.bridge.structure;

abstract class Abstraction {
    private Implementor imp;

    void operation() {
        imp.operationImp();
    }
}
