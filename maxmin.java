import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        printmax(a, b, c);
        printmin(a, b, c);

        
    }
    static void printmax(int a, int b, int c){
        int max = a;
        if(a < b){
            max = b;
        } 
        if (b < c) {
            max = c;
        }

        System.out.println("max = " + max);

    }

    static void printmin(int a, int b, int c){
        int min = a;
        if( a > b){
            min = b;
        } 
        if ( b > c){
            min = c;
        }
        System.out.println("min = " + min);;
    }
    

}
