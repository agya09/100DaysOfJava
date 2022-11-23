class Animal {
    String name;

    public void eat() {
        System.out.println("I love eating meats.");
    }
}

class Dog extends Animal {

    public void show() {
        System.out.println("HY, this is " + name + ".");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "Bullet";
        labrador.show();
        labrador.eat();
    }

}