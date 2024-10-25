import java.util.Scanner;
public class Q17_ConsecutiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();
        int sum = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            sum += Integer.parseInt(input.substring(i, i + 2));
        }
        System.out.println("Sum: " + sum);
    }
}
