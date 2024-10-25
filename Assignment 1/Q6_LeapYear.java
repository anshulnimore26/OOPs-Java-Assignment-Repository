import java.util.Scanner;
public class Q6_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "Leap Year" : "Not a Leap Year");
    }
}
