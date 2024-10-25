import java.util.Scanner;
public class Q13_SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum: " + n * (n + 1) / 2);
    }
}
