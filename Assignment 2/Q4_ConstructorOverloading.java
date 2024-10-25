public class Q4_ConstructorOverloading {
    Q4_ConstructorOverloading() {
        System.out.println("Zero-argument constructor");
    }
    Q4_ConstructorOverloading(int num) {
        System.out.println("Parameterized constructor with value: " + num);
    }
    public static void main(String[] args) {
        new Q4_ConstructorOverloading();
        new Q4_ConstructorOverloading(10);
    }
}
