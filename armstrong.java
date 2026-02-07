import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isArmstrong(n);
        System.out.println(result);
        
    }
    static boolean isArmstrong(int n) {
        int current = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10 ;
        n = n / 10;
        sum = sum + rem * rem * rem;
        }
        return sum == current;
    }
    
}














    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
       
    //     System.out.println(num);
         
    // }
    // static void numbers(int num){
    //     int original = num;
    //     int sum = 0;
        
    //     if(num>0){
    //         int rem = num % 10;
    //         num = num / 10; 
    //         sum = sum + rem*rem*rem;
    //      while(sum == original){
    //         System.out.println("true");
    //      }
    //     }
    //     System.out.println(false);
        

    // }

