public class SingletonCalculator {
    private static SingletonCalculator instance;
    private SingletonCalculator() {
    }

    public static synchronized SingletonCalculator getInstance() {
        if (instance == null) {
            instance = new SingletonCalculator();
        }
        return instance;
    }

    public double calculate(double x, double y) {
        return 2 * x + 3 / y;
    }
}
