import java.util.HashMap;
public class p20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
    }
}