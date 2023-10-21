import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
    
 // int number=5;//It is the number to calculate factorial 
 Scanner  sc =new Scanner(System.in);
 System.out.println("enter ");
 int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();

        
    }
    
}
