package AdMath;

public class admath{
    public static int fact(int n){
        if(n>=0){
            int f = 1;
            for(int i=1;i<=n;i++)
                f*=i;
            return f;
        }
        return -1;
    }    
}