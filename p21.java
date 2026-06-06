public class p21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 8;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(
                    arr[left] + " + " + arr[right]
                );
                break;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}