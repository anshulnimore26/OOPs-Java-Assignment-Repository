class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Q5_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark();
    }
}
