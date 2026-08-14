
import java.util.Scanner;

public class Q01_ValidTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first side");
    int a = sc.nextInt();
    System.out.println("Enter second side");
    int b = sc.nextInt();
    System.out.println("Enter third side");
    int c = sc.nextInt();

    if((a+b)>c && (a+c)>b && (b+c)>a){
      System.out.println("the triangle is valid");
    }else{
      System.out.println("the triangle is not vaild");
    }

    }
  }