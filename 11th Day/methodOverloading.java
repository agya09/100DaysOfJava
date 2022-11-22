public class methodOverloading {

    public static void main(String[] args) {
        System.out.println(Adder.sum(20, 30));
        System.out.println(Adder.sum(20.50, 37.25));
    }

}

class Adder {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
