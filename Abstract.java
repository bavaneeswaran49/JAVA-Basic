abstract class PrimeCheck {
    abstract void checkPrime(int num);
}
class PrimeNumber extends PrimeCheck {

    void checkPrime(int num) {
        int count = 0;

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime Number");
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}


public class Abstract {
    public static void main(String[] args) {
        PrimeCheck p = new PrimeNumber(); 
        p.checkPrime();
    }
}
