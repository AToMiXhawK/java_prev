import java.util.Scanner;

import primepackage.*;
class primecheck
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        if(Prime.prime(a))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}