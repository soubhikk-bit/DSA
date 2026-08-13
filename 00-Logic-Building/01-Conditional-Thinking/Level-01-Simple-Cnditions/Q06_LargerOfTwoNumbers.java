
import java.util.Scanner;

public class Q06_LargerOfTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();

    if(a>b)
      System.out.println("Greater number is : " + a);
    else if(a<b)
      System.out.println("Greater number is : " + b);
    else 
      System.out.println("Both number is equal");
  }
}
