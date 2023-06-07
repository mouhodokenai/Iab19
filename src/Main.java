public class Main {
    public static void main(String[] args) {

        SingletonCalculator calculator = SingletonCalculator.getInstance();
        double result1 = calculator.calculate(9, 6);
        System.out.println("Результат: " + result1);

        SingletonCalc calc = SingletonCalc.instance;
        double result2 = calc.calculated(7, 3);
        System.out.println("Результат: " + result2);

    }
}