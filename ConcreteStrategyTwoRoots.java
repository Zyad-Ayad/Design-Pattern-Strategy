public class ConcreteStrategyTwoRoots implements Strategy {
    @Override
    public String execute(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double firstroot = (-b + Math.sqrt(discriminant)) / (2 * a);
        double secondroot = (-b - Math.sqrt(discriminant)) / (2 * a);
        return "Root 1 = " + firstroot + ", " + secondroot;
    }
}
