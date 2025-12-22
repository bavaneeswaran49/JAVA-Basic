import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //a2+b2+2ab;
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("The value is :" + c);
    }
}