import java.io.*;
import java.lang.*;

class GFG {
    
    public static int fun(int a[],int n, int l)
    {
        if(n==l-1)
        {
            System.out.println(a[n]);
        return a[n];
        }
        else 
        {
            System.out.println(Math.max(a[n], fun(a,n+1,l)));
            return a[n];
            
        }
    }
	public static void main (String[] args) {
	    int a[]={7,9,8,2,5,3};
	    fun(a,0,6);
	}
}