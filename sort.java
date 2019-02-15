import java.io.*;
import java.util.Scanner;
class sort
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = (int)s.nextInt();
		int a[] = new int[10];
		System.out.println("Enter values: ");
		for(int i=0;i<n;i++)
			a[i] = (int)s.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		System.out.println("The values are: ");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
