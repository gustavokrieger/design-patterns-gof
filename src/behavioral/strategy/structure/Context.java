package behavioral.strategy.structure;

class Context {
    private Strategy strategy;

    void contextInterface() {
        strategy.algorithmInterface();
    }
}
