package kunalkcodes;

import java.util.Scanner;

public class pythatrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(isPythatriplet(a, b, c)){
            System.out.println("yes it is PT..");
        } else {
            System.out.println("not a PT..");
        }

        sc.close();
        
    }
    static boolean isPythatriplet(int a, int b, int c){
        
        int max = Math.max(a, Math.max(b,c));

        if (max == a){
            return b*b + c*c == a*a;
        } else if(max == b){
            return a*a + c*c == b*b;
        } else{
            return b*b + a*a == c*c;
        }
        
         
    }
}
