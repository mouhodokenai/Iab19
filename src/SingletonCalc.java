public enum SingletonCalc {
    instance;

    public double calculated(double x, double y) {
        return 2 * x + 3 / y;
    }
}