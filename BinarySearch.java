package ArrayChallenge;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scn.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("Array elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Sorted array=");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]);
		}
		int flag=0;
		System.out.println("The element to search");
		int ele=scn.nextInt();
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]==ele)
			{
				flag=1;
			}
		}	
		if(flag==1)
		{
		System.out.println("Element "+ele+" found");
		}
		else
		{
			System.out.println("NOt found");
		}
		

	}

}
