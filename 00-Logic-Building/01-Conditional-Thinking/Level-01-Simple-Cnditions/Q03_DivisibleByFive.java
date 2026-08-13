
import java.util.Scanner;

public class Q03_DivisibleByFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();

    if(n%5==0)
      System.out.println("the number is divisible by five");
    else
      System.out.println("the number is not divisible by five");
  }
}
