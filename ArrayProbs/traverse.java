package ArrayProbs;

public class traverse 
{
    public static void main(String[] args) 
    {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b=new int[5];
        //initializing for b
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=4;
        //traverse
        for (int i=0; i<a.length; i++) 
        {
            System.out.println(a[i]);     
        }
    }
}
