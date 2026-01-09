import java.util.Scanner;
interface A{
     void cgpa();
}
interface B extends A{
    void cgpa1();
}
interface C extends B{
     void cgpa2();
}
class D implements  C {
     public void cgpa() {
        int Tamil = 99, English = 88, Maths = 95, Social = 97, Science = 88;
        float cgpa = ((Tamil + English + Maths + Social + Science) / 5) / 10f;
        System.out.println("Total = " + cgpa + " CGPA");
    }


    public void cgpa1() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Units used");
        int unit = ob.nextInt();

        if (unit <= 100) {
            System.out.println("Fully Free for first 100 units");
        } else if (unit <= 200) {
            int bill = (unit - 100) * 2;
            System.out.println(bill + " your bill for this month");
        } else if (unit < 500) {
            int bill = (100 * 2) + ((unit - 200) * 4);
            System.out.println(bill + " This charge is for above 200 units");
        } else {
            System.out.println("You have crossed your limits");
        }
    }

    public void cgpa2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void cgpa3() {
        String[] arr = {"aa", "rewve", "wvxgwu", "ecgvsn"};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
public class Interface {
    public static void main(String[] args){
    D ob=new D();
    ob.cgpa();
    ob.cgpa1();
    ob.cgpa2();
    ob.cgpa3();
}
}