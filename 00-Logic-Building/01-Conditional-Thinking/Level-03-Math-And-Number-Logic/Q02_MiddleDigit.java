
import java.util.Scanner;


//Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
public class Q02_MiddleDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a three digit number");
    int n = sc.nextInt();

    int last = n%10;
    n = n/10;

    int middle = n%10;
    n=n/10;

    int first = n;

    if(middle>last && middle>first){
      System.out.println("midlle digit is the largest digit");
    }
    else if(middle<last && middle<first){
      System.out.println("midlle digit us is the smallest digit ");
    }
    else{
      System.out.println("its not largest or smallest digit");
    }
  }
}
