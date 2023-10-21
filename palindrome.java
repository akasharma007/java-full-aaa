import java.util.Scanner;

public class palindrome {


	/*static int reversNumber(int n) 
	{ 
		int reversed_n = 0; 
		while (n > 0) { 
			reversed_n = reversed_n * 10 + n % 10; 
			n = n / 10; 
		} 
		return reversed_n; 
	} 

	
	public static void main(String[] args) 
	{ 
		int n = 123464321; 
		int reverseN = reversNumber(n); 
		System.out.println("Reverse of n = " + reverseN); 

		
		if (n == reverseN) 
			System.out.println("Palindrome = Yes"); 
		else
			System.out.println("Palindrome = No"); 
	} 
}*/
public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int num = value.nextInt();
        int rem, rev = 0, temp;
        value.close();
        temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if (temp == rev)
            System.out.println("YES-- PALINDROME NUMBER");
        else
            System.out.println("NO --NOT A PALINDROME NUMBER");
    }
}

        
    
