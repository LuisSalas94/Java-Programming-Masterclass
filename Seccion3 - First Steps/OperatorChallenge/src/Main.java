public class Main {
    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = 100.00d * (num1 + num2);
        System.out.println("Result: " + result);
        double remainder = result % 40.00d;
        System.out.println("Remainder: " + remainder);
        boolean remainderValue = remainder == 0 ? true : false;
        System.out.println("Output of the boolean: " + remainderValue);

    }
}