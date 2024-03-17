//1095 Leet code, Find in Mountain Array
public class FindInMountainArr {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,1,0};
        int target = 1;
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