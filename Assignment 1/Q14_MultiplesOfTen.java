import java.util.Scanner;
public class Q14_MultiplesOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        for (int i = start; i <= end; i += 10) System.out.print(i + " ");
    }
}
