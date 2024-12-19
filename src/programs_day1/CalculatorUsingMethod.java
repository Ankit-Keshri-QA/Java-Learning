package programs_day1;

public class CalculatorUsingMethod {

    public double add(int a, int b) {
        return a + b;
    }

    public double subtract(int a, int b) {
        if (a >= b)
            return a - b;

        else
            return b - a;

    }

    public void multiply(int a, int b) {
        System.out.println("Multiply is :" + (a * b));
    }

    public double divide(int a, int b) {
        if (a >= b)
            return a / b;

        else
            return b / a;
    }

    public static void main(String[] args) {
        CalculatorUsingMethod cal = new CalculatorUsingMethod();
        System.out.println(cal.add(10, 20));
        System.out.println(cal.subtract(34, 87));
        cal.multiply(19, 22);
        System.out.println(cal.divide(12, 4));
    }


}
