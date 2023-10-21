import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value"); 
        n= sc.nextInt();
        if( n% 4 ==0){
            if(n%100 ==0)
             {
                if (n % 400 == 0) {
                    System.out.println("A leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("A leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
        sc.close();
        
    }
}