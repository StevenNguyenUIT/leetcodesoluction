package easy.palindromenumber;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int x = 12221;
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x){
        if (x<0) return false;
        int temp = Math.abs(x);
        int result = 0;
        while (temp!=0){
            result = result*10 + temp%10;
            temp/=10;
        }
        return result==x;
    }
}
