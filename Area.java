import java.lang.*;
import java.util.*;

class Area{
    public static void main(String args[])
    {
        double area,s;
        int a,b,c;
        System.out.println("Enter three sides");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a + b + c)*0.5f;
        area= Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("AREA IS"+area);
    }

}