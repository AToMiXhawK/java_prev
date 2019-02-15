import java.io.*;
import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = (int)s.nextInt();
		int a=0, b=1;
		for(int i=0;b<=n;i++)
		{
			if(i<=0)
				System.out.println(a);
			else
			{
				int c = b;
				b+=a;
				a=c;
				System.out.println(a);
			}
		}
	}
}
			
