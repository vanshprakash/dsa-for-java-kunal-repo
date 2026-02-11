package kunalkcodes;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        panda(n);
        sc.close();
        
    }
    static void panda(int n){
        int original = n;
        int reverse = 0;

        while(n > 0){
            int digit = n % 10; // get last digit
            reverse = reverse * 10 + digit; // reverse the number
            n = n / 10; // to eliminate the last digit
        }
        if ( original == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }
}
