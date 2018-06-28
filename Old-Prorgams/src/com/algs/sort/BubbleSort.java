package com.algs.sort;

public class BubbleSort
{

	public static void main(String[] args)
	{
		int a[] = {5,4,1,8,7,2,6,3,9};
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
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}		
	}

}
