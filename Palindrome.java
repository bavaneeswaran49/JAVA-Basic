abstract class CheckNumber {
    abstract void check(int num);
}

class PalindromeEven extends CheckNumber {

    void check(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (temp == rev && temp % 2 == 0) {
            System.out.println("Palindrome Even Number");
        } else {
            System.out.println("Not a Palindrome Even Number");
        }
    }

    public static void main(String[] args) {
        CheckNumber obj = new PalindromeEven();
        obj.check(22);
    }
}
