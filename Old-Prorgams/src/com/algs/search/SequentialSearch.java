package com.algs.search;

public class SequentialSearch
{
	public static void main(String[] args)
	{
		int a[] = {9,41,47,40,84,38,53,43,49,55};
		int n = a.length;
		int key = 84;
		boolean flag = false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Found at=>"+(i+1)+"th Position");
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Not Found");
		}
	}
}
