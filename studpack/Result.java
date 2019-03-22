package studpack;

class Student
{
	String name;
	int rollno;
	double mark1, mark2, mark3;
	Student()
	{
		name="";
		rollno=0;
		mark1=0;
		mark2=0;
		mark3=0;
	}
	Student(String n, int r, double m1, double m2, double m3)
	{
		name=n;
		rollno=r;
		mark1=m1;	
		mark2=m2;
		mark3=m3;
	}
}

interface Sports
{
        double grade=10;
        void display_grade();
}

public class Result extends Student implements Sports
{
	double total;
	public Result(String n, int r, double m1, double m2, double m3)
	{
		super(n,r,m1,m2,m3);
		total=0;
	}
	public void display_grade()
	{
		System.out.println("Grade: "+grade);
	}
	public void displayTotal()
	{
		total = mark1 + mark2 + mark3 + grade;
		System.out.println("Name: "+name);
		System.out.println("Total: "+total);
		System.out.println("Roll number: "+ rollno);
	}
}
