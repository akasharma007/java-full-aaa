import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the   alphabet");
     int choice = sc.nextInt();
      switch(choice){ 
        case 'a':
        {
            System.out.println("its a vowel");
            break;
        }
        case 'i' :
        {
            System.out.println("its a vowel");
            break;
        }
        case 'e':
          {
            System.out.println("its a vowl");
            break;
          }
        case 'o':
        {
            System.out.println("its a vowel");
            break;

        }
case 'u':
{
    System.out.println("iys a vowel");
    break;
}
    default:
    System.out.println("its a constant");

      }
      sc.close();
    }
}


