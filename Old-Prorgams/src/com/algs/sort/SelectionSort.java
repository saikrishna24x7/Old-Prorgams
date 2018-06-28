package com.algs.sort;

public class SelectionSort
{

	public static void main(String[] args)
	{
		int a[] = {5,4,1,8,7,2,6,3,9};
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			int k=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[k])
				{
					k = j;
				}
			}
			if(k!=i)
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	/*
	 * a[j] < a[k]
	 * */

}
