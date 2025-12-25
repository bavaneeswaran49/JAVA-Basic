
import java.util.Scanner;

class Constructor{
    Constructor() {
                System.out.println("Please Enter your age Brother");
        int age,dob;
       Scanner a=new Scanner(System.in);
        age=a.nextInt();

        if(age<=18){
            System.out.println("The users age is not elidgable");
            if((age>=16)&&(age<=18)){
                  System.out.println("and please apply for LLR");
                   System.out.println("Please give your DOB");
                   Scanner b=new Scanner(System.in);
                   dob=b.nextInt();
                   if((dob+18)<=2025){
                        System.out.println("unmatched "+dob+ " apply directly for License and your age is currently " +((age+dob)-2000) );
                   }
                   else if((dob+18)>=2025){
                    System.out.println("matched "+dob );
                   }
            }
            else{
                System.out.println("Prohibited for driving");
            }
        }
        else if(age>18){
            System.out.println("The users age is  elidgable");
        }
    }
    void bavan1(){
        System.out.print("Bavaneeswaran");
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        Constructor s = new Constructor();
        s.bavan1();
    }
}
