package binarySearchProblems;
public class FloorNo {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13}; 
        int target = 8; 

        int result = findFloorOrNext(sortedArray, target);
        if (result == target) {
            System.out.println("Target value found: " + result);
        } else {
            System.out.println("Smallest number higher than target: " + result);
        }
    }
    private static int findFloorOrNext(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return target; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                floor = arr[mid]; // Update floor value
                right = mid - 1;
            }
        }
        return floor;
    }
}
