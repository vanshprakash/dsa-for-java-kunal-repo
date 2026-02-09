import java.util.Scanner;

public class primeno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPrime(n);
        System.out.println(result);
        
        
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
         int c = 2;
         while(c * c <= n){

            if(n % c == 0){
            return false;
            }
        c++;
        }

        if(c * c > n){
            return true;
        }
        return false;
         

    }
}

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Prime(n);
        
//     }
//     static void Prime(int n) {

//         if ( n<=1) {
//             System.out.println("not prime no.");
//         }
//         int c = 2;

//         while( c * c <= n) {
//      
    //         if (n % c == 0) {
    //             System.out.println("Not a prime number");
    //             return;
    //         }
    //         c++;
    //     }

    //     System.out.println("Prime number");
      
//     }
    
// }


// 1. nmber 1 se jyada hona chaiye
// 2. 4 no.tak dekho if(n <=1) check krro

// 3. while check krro while( c * c / n)
