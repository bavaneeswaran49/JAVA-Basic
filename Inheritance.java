import java.util.*;
class CGPA{
    void cgpa(){
        int Tamil=99;
        int English=88;
        int Maths=95;
        int Social=97;
        int Science=88;
        float cgpa=(((Tamil+English+Maths+Social+Science)/5)/10f);
        System.out.println("Total = "+cgpa+" CGPA");
    }
}
class Electricity extends CGPA{
    void cgpa1(){   
    int unit;
    System.out.println("Enter the Units used");
    Scanner ob=new Scanner(System.in);
    unit=ob.nextInt();
    int tunit=((unit-100)*2);
    int runit=((unit-100)*2)+((unit*4)-(tunit));
    if(unit<=100){
    System.out.println(" Fully Free for first 100 units");
    }else if ((unit>=100)&&(unit<=200)) {
    System.out.println(tunit +" your bill for this month");
    }else if((unit>200)&&(unit<500)){
         System.out.println(runit+" This charge is for above 200 units");
    }else{
     System.out.println("you have crosed your limits");
     }
    }
}
class Star extends Electricity{
 void cgpa2(){
    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
        System.out.print("*" );
    }
    System.out.println(" " );
 }
}
}
class Rev extends Star{
    void cgpa3(){
         String[] arr={"aa","rewve","wvxgwu","ecgvsn"};
         for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
    }
}
}
public class Inheritance {
    public static void main (String[] args){
        Rev ob = new Rev();
        ob.cgpa();
        ob.cgpa1();
         ob.cgpa2();
        ob.cgpa3();
    }
}
