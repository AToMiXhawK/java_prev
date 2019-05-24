import java.util.Scanner;

class average
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        double n = s.nextDouble(), avg = 0.0;
        System.out.println("Enter values: ");
        for(int i=0; i<n; i++)
            avg += s.nextDouble();
        System.out.println("Average: " + avg/n);
    }
}