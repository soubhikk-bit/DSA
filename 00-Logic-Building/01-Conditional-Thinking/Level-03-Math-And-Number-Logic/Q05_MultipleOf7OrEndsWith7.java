
import java.util.Scanner;

//Check whether a number is a multiple of 7 OR ends with 7.

public class Q05_MultipleOf7OrEndsWith7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = sc.nextInt();

    int last = n%10;

    if(last == 7){
      System.out.println("the last digit of the number is 7");
    }
    else if(n%7 == 0){
      System.out.println("the number is multiple of seven");
    }
    else{
      System.out.println("enter a valid number");
    }
    sc.close();
  }
}
