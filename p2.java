public class p2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        int target = 20;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}