import java.util.Scanner;
public class Q7_GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percent = sc.nextInt();
        char grade = percent >= 90 ? 'A' : percent >= 80 ? 'B' : percent >= 70 ? 'C' : percent >= 60 ? 'D' : percent >= 40 ? 'E' : 'F';
        System.out.println("Grade: " + grade);
    }
}
