package com.miscellaneous;

public class FibonacciSeries
{

	public static void fibonacciSeries(int n)
	{
		int f0=1, f1 =1, fib;
		for(int i=1;i<=n;i++)
		{
			System.out.print(f0+" ");
			fib = f0+f1;
			f0 = f1;
			f1 = fib;
		}
	}
	
	public static int fibonacciSeriesRecursive(int n)
	{
		if(n == 0)
		{
			return 0;
		}
	    else if(n == 1)
	    {
	    	return 1;
	    }
	    else
	    {
	    	return fibonacciSeriesRecursive(n - 1) + fibonacciSeriesRecursive(n - 2);  
	    }
	}
	
	public static void main(String[] args)
	{
		fibonacciSeries(8);
		System.out.println();
		for(int i = 1;i<=8;i++)
			System.out.print(fibonacciSeriesRecursive(i)+" ");
	}

}
