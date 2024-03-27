package RecursionProblems;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int n) {
        if(n<2) //base condition
        {
            return n;
        }
        return fib(n-1)+fib(n-2);  //0,1,1,2,3,5,8,13
        
    }
}