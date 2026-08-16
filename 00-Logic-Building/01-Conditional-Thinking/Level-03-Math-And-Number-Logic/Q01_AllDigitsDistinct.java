
import java.util.Scanner;
// it's only for three digit number
public class Q01_AllDigitsDistinct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a three digit number");
    int n = sc.nextInt();

    int first = n%10;
    n = n/10;

    int middle = n%10;
    n=n/10;

    int last = n;

    if (first != middle && middle != last && first != last) {
      System.out.println("All three digit are distinct");
    }else{
      System.out.println("duplicate digits present ");
    }
    sc.close();
    
  }
}
