import java.util.*;
class pallindrome
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine(), rts="";
        for(int i=str.length()-1; i>=0; i--)
            rts = rts + str.charAt(i);
        if(rts.equals(str))
            System.out.println("Pallindrome");
        else
            System.out.println("Not pallindrome");
    }
}  