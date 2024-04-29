package ArrayChallenge;

import java.util.Scanner;

public class SecondSmlThirdLar {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scn.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("Sorted array:");
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
		System.out.println("Third Largest No: "+arr[arr.length-3]);
		System.out.println("Second smallest No : "+arr[1]);

	}

}
