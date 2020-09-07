import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner(System.in);
        Point p1=new Point();
        System.out.println("Abscisse X ?");
    
        
        p1.setX(input.nextDouble());
        System.out.println("l ordonne Y ?");
        p1.setY(input.nextDouble());
        p1.Tostring();
        System.out.println(p1.Distance(p1));

        Point p2=new Point();
        System.out.println("Abscisse X ?");
    
        
        p2.setX(input.nextDouble());
        System.out.println("l ordonne Y ?");
        p2.setY(input.nextDouble());
        System.out.println(p1.Distance(p1));

        System.out.println("La distance entre P& et p2 :"+p1.Distance(p1.getX(),p1.getY(),p2.getX(),p2.getY()));


    }
}
