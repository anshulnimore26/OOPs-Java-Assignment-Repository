import java.util.Scanner;

public class BinaryDecimalConverter_Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            int binary = sc.nextInt();
            System.out.println(Integer.parseInt(String.valueOf(binary), 2));
        } else {
            int decimal = sc.nextInt();
            System.out.println(Integer.toBinaryString(decimal));
        }
    }
}
