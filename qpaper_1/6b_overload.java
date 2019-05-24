class overload
{
    static double area(double a, double b, double c){
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    static double area(int r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
            System.out.println(area(3,4,5));
            System.out.println(area(3));
    }
}