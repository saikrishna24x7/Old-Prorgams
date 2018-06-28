package com.algs.search;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int b[] = {9,41,47,40,84,38,53,43,49,55};
		int a[] = sort(b);
		int n = a.length;
		int key = 84;
		int i=0, j=n-1;
		int mid = (i+j)/2;
		while(i<=j)
		{
			if ( a[mid] < key )
			{
				i = mid + 1;
			}
			else if ( a[mid] == key ) 
			{
				System.out.println("Found at=>"+(mid+1)+"th Position");
		        break;
			}
			else
			{
				j = mid - 1;
			}		 
			mid = (i + j)/2;
		}
		if(i>j)
		{
		      System.out.println(key + " is not present in the list.");
		}
	}

	public static int[] sort(int a[])
	{
		int n = a.length;
		boolean flag = true;
		while(flag)
		{
			flag = false;
			for(int i=0;i<n-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					flag = true;
				}
			}
		}	
		return a;
	}
}
