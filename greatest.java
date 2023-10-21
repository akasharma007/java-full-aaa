import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        int p, q, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        p= sc.nextInt();
        q = sc.nextInt();
        r = sc.nextInt();

        int s = (p> q) ? ((p > r) ? p : r) : ((q > r) ? q : r);
        int s1 = (p < q) ? ((p < r) ? p : r) : ((q < r) ? q : r);

        int z = (s != p && s1 != p) ? p : (s != q && s1 != q) ? q : r;

        System.out.println(s + " is greatest");
        System.out.println(z + " is Middle");
        System.out.println(s1 + " is smallest");

        sc.close();
    }
    
}


