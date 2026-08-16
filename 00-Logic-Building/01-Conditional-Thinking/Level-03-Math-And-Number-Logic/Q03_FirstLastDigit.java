
import java.util.Scanner;

//Take a 4-digit number and check if the first and last digits are equal.

public class Q03_FirstLastDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a four digit number");
    int n = sc.nextInt();

    int first = n/1000;
    int last = n%10;

    if (first == last ) {
      System.out.println("first and last digit are equal");
    }
    else{
      System.out.println("Fisrt and last digit are not equal");
    }
    sc.close();
  }
}
