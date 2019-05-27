import java.util.Scanner;

class pallindrome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine(), str_1="";
        int n = str.length();
        for(int i=0;i<n;i++)
            str_1 = str_1 + str.charAt(n-i-1);
        if(str.equals(str_1))
            System.out.println("Pallindrome");
        else
            System.out.println("Not pallindrome");
    }
}