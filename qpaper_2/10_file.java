import java.io.FileReader;

class file{
    public static void main(String[] args) {
        FileReader fr = null;
        int ch;
        try {
            fr = new FileReader("text.txt");
            while((ch=fr.read())!=-1)
                System.out.print((char)ch);
            fr.close();        
        } catch (Exception e) {
            System.out.println("File not found");
        } 
    }
}