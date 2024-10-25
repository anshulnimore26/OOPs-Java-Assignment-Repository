class Parent {
    static void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    static void show() {
        System.out.println("Child show");
    }
}
public class Q8_MethodHiding {
    public static void main(String[] args) {
        Parent.show();
        Child.show();
    }
}
