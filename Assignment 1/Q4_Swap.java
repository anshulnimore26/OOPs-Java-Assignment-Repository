import java.util.Scanner;
public class Q4_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a; a = b; b = temp;
        System.out.println("After Swap: " + a + ", " + b);
    }
}
