
import java.util.Scanner;



public class Q02_TriangleClassification {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first side");
    int a = sc.nextInt();
    System.out.println("Enter the second side");
    int b = sc.nextInt();
    System.out.println("Enter the third side");
    int c = sc.nextInt();

    if((a+b)>c && (a+c)>b && (b+c)>a){
      System.out.println("the triangle is valid");
      if(a==b && b==c){
        System.out.println("the triangle is a equilateral");
      }
      else if(a==b || a==c || b==c) {
         System.out.println("the triangle is a isosceles");
      }
      else if(a!=b && b!=c && a!=c){
         System.out.println("the triangle is a scalene");
      }
    }else{
      System.out.println("not a valid triangle");
    }
    sc.close();
  }
}