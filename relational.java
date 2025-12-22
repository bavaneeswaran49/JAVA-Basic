public class relational {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b :" +(a!=b));
        System.out.println("a>b :" +(a>b));
        System.out.println("a<b :" +(a<b));
         System.out.println("a>=b :" +(a>=b));
        System.out.println("a<=b :" +(a<=b));
        // conditional operator(ternary operator)
        c=a>b ? a:b;
        System.out.println("Largest value is :" + c);
    }
}
