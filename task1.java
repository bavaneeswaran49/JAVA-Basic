
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
       
       //1st float to double
    //    double a = 10.55;
    //     float b=(float)a;
    //     System.out.println("Double to Float: "+b);
    //     float f=10.557f;
    //     double d=(double)f;
    //     System.out.println("Float to Double: "+d);

         //2nd Scanner class
         /* String name ;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = scanner.nextLine(); 
        */

        //3Maximun and Minimum
       /* int[] x = {10, 20, 30, 40, 50};
        System.out.println("Minimum value in array: " + java.util.Arrays.stream(x).min());
        System.out.println("Maximum value in array: " + java.util.Arrays.stream(x).max());*/ 

        //4Find the size of int, float, double and char
       /* System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");*/ 

        //5addition of two numbers without using +
        /*int i = 10;
        int j = 20;
        while(j>0){
            i++;
            j--;
        }
        System.out.println(i);*/

        //6lenght and Breadth
        /*int length;
        int breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in Cm: ");
         length=scanner.nextInt();
        System.out.println("Enter breadth: "); 
        breadth=scanner.nextInt();
        int area=length*breadth;
        System.out.println("Area of rectangle in Cm: "+area);*/

        //7Student grade
        /*int mark;
        Scanner  ob=new Scanner(System.in);        
       System.out.println("Enter your Percentage");
 mark=ob.nextInt();
        if((mark<=100)&&(mark>=90)){
            System.out.println("Grade A");
        }else if ((mark<=89)&&(mark>=70)) {
            System.out.println("Grade B");
        }
        else if ((mark<=69)&&(mark>=50)) {
            System.out.println("Grade c");
        }
        else if((mark<=49)&&(mark>=30)){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }*/

        //8Switchcase
        /* 
        int a,b,c,ch;
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
Scanner ob=new Scanner(System.in);
ch=ob.nextInt();
Scanner ob1=new Scanner(System.in);
a=ob1.nextInt();
Scanner ob2=new Scanner(System.in);
b=ob2.nextInt();
switch(ch){
    case 1: 
    c=a+b;
    System.out.println("1.Addition" +c);
    break;
    case 2:
    c=a-b;
    System.out.println("2.Subtraction" +c);
    break;
    case 3:
    c=a*b;
    System.out.println("3.Multiplication" +c);
    break;
    case 4:
    c=a/b;
    System.out.println("4.Division" +c);
    break;
    default:
    System.out.println("Invalid Input" +ch);
    break;
    }*/
    //9Atm machine
    
   /*int balance=5000;
    // int password=9942;
       System.out.println("Enter your password:");

    Scanner sc=new Scanner(System.in);
   int pass=sc.nextInt();
    if(pass==9942){
        System.out.println("your balance is :"+balance);
        if(balance>=1000){
            System.out.println("Enter the amount to withdraw:");
            int withdraw=sc.nextInt();
            if(withdraw<=balance){
                balance=balance-withdraw;
                System.out.println("Please collect your cash");
                System.out.println("Your remaining balance is :"+balance);
            }else{
                System.out.println("Insufficient balance");
            }
    }
    else {
        System.out.println("Wrong Password inserted");
    }
 */ 
    //10cgpa
    /* 
    int english;
    int Tamil;
    int Science;
    int Social;
    int Maths;
    System.out.println("Enter your English mark:");
    Scanner T=new Scanner(System.in);
    english=T.nextInt();
    System.out.println("Enter your Tamil mark:");
    Scanner T1=new Scanner(System.in);
    Tamil=T1.nextInt();
    System.out.println("Enter your Science mark:");
    Scanner T2=new Scanner(System.in);
    Science=T2.nextInt();
    System.out.println("Enter your Social mark:");
    Scanner T3=new Scanner(System.in);
    Social=T3.nextInt();
    System.out.println("Enter your Maths mark:");
    Scanner T4=new Scanner(System.in);
    Maths=T4.nextInt();

    int total=english+Tamil+Science+Social+Maths;
    float percentage=total/5;
    double cgpa=((percentage/100)*10);
    int cgpa1=(int)Math.ceil(cgpa);
    System.out.println("Your CGPA is :"+cgpa1);*/

    //Alphabet check
    /*char alpha;
    Scanner al=new Scanner(System.in);
    System.out.println("Enter the Alphabet:");
    alpha=al.next().toUpperCase().charAt(0);
    if((alpha>='A' && alpha<='Z')){
    System.out.println(alpha+"is a Alphabet ");
    }
    else{
        System.out.println("Not an Alphabet");
    }*/

    //bank Accounts
    // int id1=1;
    /*String name="John Doe";
    double balance=5000.0;
    String name2="Bavan";
    double balance2=1900.0;
    int id;
    int pin;
    Scanner scanner=new Scanner(System.in);
    Scanner scanner1=new Scanner(System.in);
    System.out.println("Enter your ID:");
    id=scanner.nextInt();
    System.out.println("Enter your PIN:");
    pin=scanner1.nextInt();

    if(id==1 && pin==1234){
        System.out.println("Account Holder: "+name);
        System.out.println("Account Balance: $"+balance);
    }
    else if(id==2 && pin==1234){
        System.out.println("Account Holder: "+name2);
        System.out.println("Account Balance: $"+balance2);
    }
    else{
        System.out.println("Invalid ID or PIN");
    }*/


    //swap two numbers
    /*int x=10;
    int y=20;
    x +=y;
    y = x - y;
    x = x - y;
    System.out.println("After swapping: x=" + x + " y="+y);*/

    // Finding the largest number using ternary operator
    // int i=20; 
    // int j=30;
    // int k=40;
    // int c=i>j ? (i>k ? i : k) : (j>k ? j : k);
    // System.out.println("The largest number is: "+c);

    //2
    int n=0;
    for(int i=n;i<5;i++){
       for (int j=0;j<=5;j++){
            for(int k=0;k<=j;k++){
        System.out.print("*");
    }
    System.out.println();
            }   
        }

    //1
    for(int i=1;i<=3;i++){
        for(int j=1;j<=4;j++){
            System.out.print("1");
        }
        System.out.println();
    }
  //2
        // int row = 5;
        // for (int i = 1; i <= row; i++) {
        //     for (int j = i; j < row; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //3
        //  for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 3; j++) {
        //         System.out.print("1");
        //     }
        //     System.out.println();
        // }
       
       
        //4
        // int rows = 4;
        // int cols = 7;

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {

        //         if (j == 0 || j == cols - 1 ||
        //             (i == j && i <= rows / 2) ||
        //             (i + j == cols - 1 && i <= rows / 2)) {

        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        //5
        //  int n = 8;

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //6
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //7
        //        int n=5;
        //      for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         for(int k=j;k<=j;k++)
        //         System.out.print(k);
        //     }
        //     System.out.println(" ");
        // }
        // int num=2;
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=2;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //Factorial of a number
        //what is factorial
        //it means that multiplying a series of descending natural numbers.
        // for example factorial of 5 is 5*4*3*2*1

        // Scanner fa=new Scanner(System.in);
        // System.out.println("Enter a number to find factorial:");
        // int n=fa.nextInt();            int f=1;
        // for(int i=1;i<=n;i++){

        //     f=f*i;
        // }
    }
}
   