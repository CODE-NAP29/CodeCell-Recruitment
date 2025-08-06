import java.util.*;

public class quad {
    public static void main(String arg[])
        {    char A,B;
        B= ++A;
        System.out.println("the value of B is "+B);
        double r1,r2,D;
        int a,b,c;
        System.out.println("Enter the coefficients ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
       
        D= Math.sqrt((b*b)-4*a*c);
        r1= (-b - D)/(2*a);
        r2 = (-b + D)/(2*a);

        System.out.println(" the roots are "+ r1 +"\n"+ r2);
        sc.close();
    }
}
