
import java.util.Scanner;



public class Q10_ProductOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = sc.nextInt();

    int prod = 1;
    while(n!=0){
      int digit = n%10;
      prod*=digit;
      n/=10;

    }
    System.out.println(prod);
    sc.close();
  }
}
