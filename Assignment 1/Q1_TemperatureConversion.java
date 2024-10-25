import java.util.Scanner;
public class Q1_TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().charAt(0);
        if (unit == 'C') System.out.println("Fahrenheit: " + ((temp - 32) * 5/9));
        else if (unit == 'F') System.out.println("Celsius: " + (temp * 9/5 + 32));
        else System.out.println("Invalid input");
    }
}
