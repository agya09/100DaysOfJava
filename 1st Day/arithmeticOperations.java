class arithmeticOperations {
    public static int sum(int a, int b) {

        int sum = a + b;
        return sum;

    }

    public static int difference(int a, int b) {
        int diff = a - b;
        return diff;
    }

    public static int multiplication(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int division(int a, int b) {
        int div = a % b;
        return div;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int addition = sum(10, 5);
        int subtraction = difference(10, 5);
        int multiplication = multiplication(10, 5);
        int division = division(10, 5);

        System.out.println("Sum of two numbers : " + addition);
        System.out.println("Difference of two numbers : " + subtraction);
        System.out.println("Multiplication of two numbers : " + multiplication);
        System.out.println("Division of two numbers : " + division);
    }
}