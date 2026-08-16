
import java.util.Scanner;



public class Q06_PointQuadrant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter x coordinate");
    int x = sc.nextInt();

    System.out.println("Enter y coordinate");
    int y = sc.nextInt();

    if(x>0 && y>0)
      System.out.println("the coordinate lies in positive x  and positive y");
    
    else if(x>0 && y < 0)
      System.out.println("coordinate lies in positive x and negetive y");
    else if(x<0 && y < 0)
      System.out.println("coordinate lies in negetive x and negetive y");
    else if(x<0 && y > 0)
      System.out.println("coordinate lies in positive y and negetive x");
    else 
      System.out.println("enter a valid coordinate");
   }
}
