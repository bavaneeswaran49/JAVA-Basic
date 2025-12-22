public class Arthematic {
    public static void main(String[] args) {
        int a=15;
        int b=4;
     /*  int sum=a+b;
        int sub=a-b;
        int mul=a*b; */ 
        // int div=((double)a/b);
        // int mod=a%b;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double)a/b);
        System.out.println(a%b);
        // Arthematic assignment operators
         a+=10; 
        System.err.println("Arthematic Addition :" + a);
        a-=10;
        System.err.println("Arthematic Subtraction :" + a);
        a*=10;
        System.err.println("Arthematic Multiplication :" + a);
        a/=10;
        System.err.println("Arthematic Division :" + a);
        a%=10;
        System.err.println("Arthematic Modulus :" + a);
    }
}
