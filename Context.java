public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public String execute(double a, double b, double c) {
        if(strategy == null)
        {
            throw new IllegalStateException("Set strategy before executing the context");
        }
        else return strategy.execute(a,b,c);
    }
}
