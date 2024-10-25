import java.util.Scanner;
public class Q3_MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Max: " + Math.max(a, Math.max(b, c)));
    }
}
