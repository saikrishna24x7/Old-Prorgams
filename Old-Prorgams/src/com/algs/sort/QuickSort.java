package com.algs.sort;

public class QuickSort
{

	int a[] = {5,4,1,8,7,2,6,3,9};
	int n = a.length;
	public void sort(int low, int high)
	{
		int i=low, j=high;
		int pivot = a[(high+low)/2];
		System.out.println("pivot=>"+pivot);
		while(i<=j)
		{
			while(a[i]<pivot)
			{
				i++;
			}
			while(a[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
			for(int k=0;k<n;k++)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();
			if(low<j)
			{
				sort(low, j);
			}
			if(i<high)
			{
				sort(i, high);
			}
		}
	}
	
	public static void main(String[] args)
	{
		QuickSort s = new QuickSort();
		s.sort(0, s.n-1);
		for(int k=0;k<s.n;k++)
		{
			System.out.print(s.a[k]+" ");
		}
		System.out.println();
	}

}
