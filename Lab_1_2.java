import java.lang.Math;
public class Lab_1_2 {

    public static void main(String[] args) {
        // Для рівняння 13
        double a13 = -2.86;
        double b13 = 1.62;
        double c13 = 10.874;
        double d13 = -2.91;
        double result13 = solveEquation13(a13, b13, c13, d13);
        System.out.println("Результат для рівняння 13: " + result13);

        // Для рівняння 14
        double a14 = 1.54;
        double b14 = 0.49;
        double c14 = 24.1;
        double d14 = 0.87;
        double result14 = solveEquation14(a14, b14, c14, d14);
        System.out.println("Результат для рівняння 14: " + result14);

        // Для рівняння 15
        double a15 = 1.25;
        double b15 = 3.09;
        double c15 = 4.25;
        double d15 = 0.56;
        double result15 = solveEquation15(a15, b15, c15, d15);
        System.out.println("Результат для рівняння 15: " + result15);
    }

    public static double solveEquation13(double a, double b, double c, double d) {
        return (Math.log(Math.abs(2*a)) / (3 * b)) - (c / Math.sqrt(Math.abs(d)));
    }

    public static double solveEquation14(double a, double b, double c, double d) {
        if (b - a < 0) {
            System.out.println("Помилка: спроба отримати корінь з від'ємного числа для рівняння 14");
            return Double.NaN;
        }
        return 2 - ((Math.sin(a) + Math.log(c)) / (Math.sqrt(b - a) * d));
    }

    public static double solveEquation15(double a, double b, double c, double d) {
        if (b < -1 || b > 1) {
            System.out.println("Помилка: значення b для рівняння 15 виходить за допустиму межу для функції acos");
            return Double.NaN;
        }
        return 2 - (Math.tan(a) / Math.sqrt(Math.acos(b))) - (3 * Math.exp(c - d * Math.sinh(d)));
    }
}