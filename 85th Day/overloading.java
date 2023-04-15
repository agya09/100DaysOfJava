public class overloading {
    private int x;
    private int y;

    // Constructor Overloading
    public overloading() {
        this.x = 0;
        this.y = 0;
    }

    public overloading(int value) {
        this.x = value;
        this.y = 0;
    }

    public overloading(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method Overloading
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Operator Overloading
    public overloading add(overloading obj) {
        overloading result = new overloading();
        result.x = this.x + obj.x;
        result.y = this.y + obj.y;
        return result;
    }

    public static void main(String[] args) {
        // Constructor Overloading
        overloading obj1 = new overloading();
        overloading obj2 = new overloading(5);
        overloading obj3 = new overloading(3, 7);

        // Method Overloading
        System.out.println("Sum of two numbers: " + obj1.sum(2, 3));
        System.out.println("Sum of three numbers: " + obj1.sum(2, 3, 4));

        // Operator Overloading
        overloading obj4 = new overloading(1, 2);
        overloading obj5 = new overloading(3, 4);
        overloading obj6 = obj4.add(obj5);
        System.out.println("Result of operator overloading: " + obj6.x + ", " + obj6.y);
    }
}
