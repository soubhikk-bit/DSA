
import java.util.Scanner;

public class Q04_DivisibleByThreeAndFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

    if(n%3==0 && n%5==0)
      System.out.println("The number is divisible by three and five");
    else
      System.out.println("the number is not divisible by three and five");
  }
}
