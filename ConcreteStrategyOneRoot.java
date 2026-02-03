public class ConcreteStrategyOneRoot implements Strategy {
    @Override
    public String execute(double a, double b, double c) {

        return "root 1 = root 2 = " + (-b / (2 * a));

    }
}
