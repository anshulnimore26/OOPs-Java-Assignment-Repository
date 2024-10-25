import java.util.HashMap;
import java.util.Scanner;

public class DuplicatesInArray_Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        map.forEach((key, value) -> {
            if (value > 1) System.out.println(key + ": " + value);
        });
    }
}
