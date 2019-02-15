import java.io.*;
import java.util.Scanner;
class floyd
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = (int)s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if((i+j)%2==0)
					System.out.print("1 ");	
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
