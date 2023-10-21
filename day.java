import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the choice");
        int choice = sc.nextInt();
        System.out.println("Enter the day 1.monday \n 2. tuesday \n 3.wednesday \n 4. thursay \n 5.friday \n 6. saturday \n 7. sunday (1,2,3,4,5,6,7): ");
        
        switch(choice){
            case 1:
            System.out.println("it is a weekday");
            break;
            case 2:
            System.out.println("its is a weekday");
            break;
            case 3:
            System.out.println("its is a weekday");
            break;
            case 4:
            System.out.println("its is a weekday");
            break;
            case 5:
            System.out.println("its is a weekday");
            break;
            case 6:
            System.out.println("its is a weekend day");
            break;
 case 7:
 System.out.println("its is a weekend day");
 break;
  default:
  System.out.println("invalid");
  break;
  


     

       }




        sc.close();

    }
    
}
