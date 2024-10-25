public class Q6_MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Q6_MethodOverloading obj = new Q6_MethodOverloading();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5.5, 10.5));
    }
}
