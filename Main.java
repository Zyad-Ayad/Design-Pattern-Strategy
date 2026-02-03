public class Main {

    public static void main(String[] args) {

        double a = 2, b = 4, c = 2;
        double discriminant = b * b - 4 * a * c;

        Context ctx = new Context();

        if(discriminant > 0) {
            ctx.setStrategy(new ConcreteStrategyTwoRoots());
        }
        else if (discriminant == 0) {
            ctx.setStrategy(new ConcreteStrategyOneRoot());
        }
        else {
            ctx.setStrategy(new ConcreteStrategyComplexRoot());
        }

        System.out.println(ctx.execute(a, b, c));

    }
}