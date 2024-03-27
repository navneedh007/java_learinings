package ArrayProbs;

public class minimumValue
{
    static void min(int arr[]) 
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < min) 
            {
                min = arr[i];
                System.out.println(min); 
            }   
        }
    }
    public static void main(String args[])
    {  
        int a[]={33,3,4,5};//declaring and initializing an array  
        min(a);//passing array to method  
    }
}
