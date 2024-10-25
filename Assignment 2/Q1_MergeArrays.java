import java.util.Arrays;
public class Q1_MergeArrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6};
        int[] C = new int[A.length + B.length];
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);
        Arrays.sort(C);
        System.out.println(Arrays.toString(C));
    }
}
