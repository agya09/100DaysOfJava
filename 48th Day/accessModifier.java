class A {
    private int data = 10;

    private void message() {
        System.out.println("Test message");
    }
}

public class accessModifier {
    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob.data); // Gives Error
        ob.message(); // Gives error
    }

}
