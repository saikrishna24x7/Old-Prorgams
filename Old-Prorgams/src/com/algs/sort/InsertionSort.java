package com.algs.sort;

import java.io.IOException;

public class InsertionSort
{

	public static void main(String[] args) throws IOException
	{
		int a[] = {5,4,1,8,7,2,6,3,9};
		int n = a.length;
		for(int i=2;i<n;i++)
		{
			for(int k=i;k>0&&a[k]<a[k-1];k--)
			{
				int temp = a[k];
				a[k] = a[k-1];
				a[k-1] = temp;
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}

}
