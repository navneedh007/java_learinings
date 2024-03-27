//852 Peek index in a  array leetcode
//example: [0,1,0] this array, peek index is 1
//example: [3,2,1,2,3] this array is otherwise known as bitonic array
package LeetCodeProbs;
public class peakIndex852 {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,1,0};
        int ans=peakIndex1(arr);
        System.out.println(ans);
    }
    static int peakIndex1(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;    
            if(arr[mid+1]<arr[mid]){
                end=mid;
            }
            else {
                start=mid+1;
            }
            
        }
        return start;
      
    }
}
