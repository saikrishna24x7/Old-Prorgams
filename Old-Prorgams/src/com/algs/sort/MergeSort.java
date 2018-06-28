package com.algs.sort;

public class MergeSort
{
	int count = 0;
	int a[] = {5,4,1,8,7,2,6,3,9};
	int c[] = new int[a.length];
	public void mergeSort(int low, int high)
	{
		int middle = 0;
		if(low<high)
		{
			middle = (low+high)/2;
			mergeSort(low, middle);
			mergeSort(middle+1, high);
			merge(low, middle, high);
		}
	}

	public void merge(int low, int middle, int high)
	{
		for (int i = low; i <= high; i++) 
		{
			c[i] = a[i];
		}
		int i=low, j=middle+1, k=low;
		while(i<=middle&&j<=high)
		{
			if(c[i]<=c[j])
			{
				a[k] = c[i];
				i++;
			}
			else
			{
				a[k] = c[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			a[k] = c[i];
			k++;
			i++;
		}
		
		for(int z=0;z<a.length;z++)
		{
			System.out.print(a[z]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		MergeSort m = new MergeSort();
		int len = m.a.length;
		m.mergeSort(0,len-1);
	}
}
