public class ConcreteStrategyComplexRoot implements Strategy {
    @Override
    public String execute(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        return "Complex roots : " + (-b / (2 * a)) + " + " + (Math.sqrt(-discriminant) / (2 * a)) + "i, " + (-b / (2 * a)) + " - " + (Math.sqrt(-discriminant) / (2 * a));
    }
}
