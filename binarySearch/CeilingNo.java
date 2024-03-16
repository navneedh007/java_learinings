public class CeilingNo {
    public static int findCeiling(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0) {
            return Integer.MIN_VALUE; // No smaller number found
        }

        return arr[right]; // Greatest number lower than the target
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 9;

        int result = findCeiling(arr, target);
        if (result == target) {
            System.out.println("Target value found: " + target);
        } else {
            System.out.println("Greatest number lower than the target: " + result);
        }
    }
}
