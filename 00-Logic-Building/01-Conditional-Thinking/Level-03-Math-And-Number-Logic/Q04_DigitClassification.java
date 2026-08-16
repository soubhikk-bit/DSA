
import java.util.Scanner;



public class Q04_DigitClassification {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = sc.nextInt();

    if (n>0 && n<=9) {
      System.out.println("it's a single digit number");
    } 
    else if(n<=99) {
      System.out.println("it's a double digit number");
    }
    else{
      System.out.println("it's a multidigit number");
    }
    sc.close();
  }
}
