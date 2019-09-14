package com.bridgelabz.arrayprogram;

public class PrimeNumber2DArray {

	public static void main(String[] args) {
		int range=100;
		int a=0,b=0;
		int[][] arr=new int[10][100];
		for(int i=2;i<1000;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				
				if(i<range)
				{
					arr[a][b]=i;
					System.out.print(arr[a][b]+" ");
					b=b+1;
				}
				
	
			}
			if(i==range) {
				range=range+100;
				a++;
				b=0;
				System.out.println();
			}
		}
		
		
		
		
       
	}

}
