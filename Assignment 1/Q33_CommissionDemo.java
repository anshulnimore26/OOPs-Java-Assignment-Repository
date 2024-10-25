import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales < 0) throw new IllegalArgumentException("Invalid Input");
        this.sales = sales;
    }

    public double calculateCommission() {
        return sales * 0.1; // Example: 10% commission
    }
}

public class Q33_CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();
        try {
            Commission commission = new Commission(sales);
            System.out.println("Commission: " + commission.calculateCommission());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
