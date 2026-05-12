public class Main {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 10, 15, 20};

        int ans = binarySearch(arr, 15);

        System.out.println("Index: " + ans);
    }
}