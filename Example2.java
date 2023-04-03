import java.util.Scanner;

public class Example2 {
    //Given an integer x, return true if x is a palindrome, and false otherwise.

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int pallNumber = 0;
        int original = x;

        while (original != 0) {
            pallNumber = pallNumber * 10 + original % 10;
            original /= 10;
        }
        return x == pallNumber;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        boolean res=isPalindrome(x);
        System.out.println(res);
    }
}
