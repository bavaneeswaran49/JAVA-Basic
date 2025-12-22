/*type casting in java 
widening casting(enlarging)
byte -> short -> char -> int -> long -> float -> double
narrowing casting(shrinking)
double -> float -> long -> int -> char -> short -> byte*/

public class casting {
    public static void main(String[] args) {
        int a=10;
        double b=a,d=25.864;//widening
        int c=(int)d;
        System.out.println("int"+a);
        System.out.println("double"+b);
        System.out.println("int"+a);
        System.out.println("double"+c);

    }
}
