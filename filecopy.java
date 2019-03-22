import java.io.*;

public class filecopy 
{
    public static void main(String[] args) {

        System.out.print("Enter file name: ");
        String st1 = System.console().readLine();
        System.out.print("Enter target file name: ");
        String st2 = System.console().readLine();
        FileReader fr;
        FileWriter fw;
        try {
            fr = new FileReader(st1);
            fw = new FileWriter(st2);
            int ch;
            while ((ch = fr.read()) != -1)
                fw.write((char) ch);
            fw.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Input file missing");
        }
    }

}