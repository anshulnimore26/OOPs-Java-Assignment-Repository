class ThisExample {
    int a;
    ThisExample(int a) {
        this.a = a;
    }
    void display() {
        System.out.println("Value of a: " + this.a);
    }
}
public class Q15_TestThis {
    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.display();
    }
}
