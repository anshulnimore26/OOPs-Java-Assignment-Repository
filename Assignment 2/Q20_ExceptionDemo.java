public class Q20_ExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Negative index exception: " + e.getMessage());
        }
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
}
