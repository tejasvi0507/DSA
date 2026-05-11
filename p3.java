public class p3 {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {   
        int[] arr = {10, 5, 20, 8};
        int ans = linearSearch(arr, 20);
        System.out.println(ans);
    }
}