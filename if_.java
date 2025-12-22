public class if_ {
    public static void main(String[] args) {
        // votingEligibility;
    //     int a;
    //    System.out.println("Enter your age: ");
    //     Scanner o=new Scanner(System.in);
    //      a =o.nextInt();
    //     if(a>=18) {
    //         System.out.println("You are a elegible to vote.");
    //     } else {
    //         System.out.println("You are not elegible to vote.");
    //     }
   // odd or even number;
    // int a=0;
    // if(a%2==0){
    //     System.out.println("The number is even."+a);
    // }else if(a==0){
    //     System.out.println("The number is zero."+a);
    // }else{
    //     System.out.println("The number is odd."+a);
    // }
    // int marks;
    // Scanner ob=new Scanner(System.in);
    // marks=ob.nextInt();
    // if(marks>=90){
    //     System.out.println("Grade A");
    // }
    // else if(marks<=90 && marks>=80){
    //     System.out.println("Grade B");
    // }
    // else if(marks<=80 && marks>=70){
    //     System.out.println("Grade C");
    // }
    // else if(marks<=70 && marks>=60){
    //     System.out.println("Grade D");
    // }
    // else{
    //     System.out.println("Fail");
    // }
    // int unit;
    // Scanner ob=new Scanner(System.in);
    // unit=ob.nextInt();
    // int tunit=((unit-100)*2);
    // int runit=((unit-100)*2)+((unit*4)-(tunit));
    // if(unit<=100){
    //     System.out.println("Fully Free for first 100 units");
    // }else if ((unit>=100)&&(unit<=200)) {
    //     System.out.println(tunit +"    your bill for this month");
    // }else if((unit>200)&&(unit<500)){
    //     System.out.println(runit+"This charge is for above 200 units");
    // }else{
    //     System.out.println("you have crosed your limits");
    // }
    // int age;
    // Scanner ob=new Scanner(System.in);
    // age=ob.nextInt();
    // System.out.println("Age="+age);

  
    // Nested if
/*a company  insurance itts driver in the following case
        a.if the driver is married
        b.if the driver is unmarried ,,male & above 30years of age
        c.is unmarried,female & above 25
*/

// Scanner m=new Scanner(System.in);
// System.out.print("Enter the maratial status M/U : ");
// char maratial=m.next().charAt(0);

// if((maratial=='u') || (maratial=='U')){
//     System.out.println("M/f : ? ");
//   Scanner n=new Scanner(System.in);
//   char num=n.next().charAt(0);
//   if((num=='M') || (num=='m')){
//      System.out.println("Second Condition Satisified,give your age: ");
//      Scanner o=new Scanner(System.in);
//         int age=o.nextInt();
//         if((age>30)&&(age<60)){
//             System.out.println("You are elidgible for the Insurance");
//   }else if((num=='F') || (num=='f')){
//      System.out.println("Second Condition Satisified,give your age: ");
//   }
// else if((maratial=='M') || (maratial=='M')){
//     System.err.println("You are not elidgible for the Insurance");
// }
// }

// int a,b,c,ch;
// System.out.println("1.Addition");
// System.out.println("2.Subtraction");
// System.out.println("3.Multiplication");
// System.out.println("4.Division");
// Scanner ob=new Scanner(System.in);
// ch=ob.nextInt();
// Scanner ob1=new Scanner(System.in);
// a=ob1.nextInt();
// Scanner ob2=new Scanner(System.in);
// b=ob2.nextInt();
// switch(ch){
//     case 1: 
//     c=a+b;
//     System.out.println("1.Addition" +c);
//     break;
//     case 2:
//     c=a-b;
//     System.out.println("2.Subtraction" +c);
//     break;
//     case 3:
//     c=a*b;
//     System.out.println("3.Multiplication" +c);
//     break;
//     case 4:
//     c=a/b;
//     System.out.println("4.Division" +c);
//     break;
//     default:
//     System.out.println("Invalid Input" +ch);
//     break;
//     }
int i=20;
int j=30;
int k=40;
int c=i>j ? (i>k ? i : k) : (j>k ? j : k);
System.out.println("The largest number is: "+c);
}
}