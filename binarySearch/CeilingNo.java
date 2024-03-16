//its main function is to find the ceiling of a no in a sorted array
//celing number is nothing but the smallest no or nearest number greater than the given no
public class CeilingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,11,12};
        int target = 8;
        int ans = ceilingOfNo(arr, target);
        System.out.println("Ceiling index: " + ans);
    }

    static int ceilingOfNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;//using end-start because start+end can lead to overflow of an integer
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
