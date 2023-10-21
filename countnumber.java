import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        
    
    System.out.println("Enter number of your choice");
    
    int num=1234;
    int count = 0;
    while (num != 0) {
        num /= 10;
        count++;
    }
    
    System.out.println("Number of digits: " + count);
}
}
   
    
    

