package com.miscellaneous;

public class NPrimes 
{
	public static void nPrimes(int n)
	{
		for(int i=2;i<=n;i++)
    	{
    		int count = 0;
			for(int j=2;j<=i/2;j++)
			{
				if(i % j ==0)
				{
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
    	}  
	}
	
    public static void main(String[] args)
    {
    	nPrimes(20);    	  	
    }
}