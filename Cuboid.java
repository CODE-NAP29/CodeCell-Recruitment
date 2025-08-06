import java.util.Scanner;
public class Cuboid {
    public static void main(String args[])
    {
        int length, breadth , height;
        double volume ;
        System.out.println("Enter the dimentions");
        Scanner s = new Scanner(System.in);
        length = s.nextInt();
        breadth = s.nextInt();  
        height = s.nextInt();
        volume = length * breadth * height;
        System.out.println("Volume of the cuboid is: " + volume);
        s.close();
    
    }
    
}
