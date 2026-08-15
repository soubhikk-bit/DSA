
import java.util.Scanner;

public class Q04_NumberSignAndRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

    if(n>0){
      System.out.println("The number is a positive number");
      if (n>100) {
        System.out.println("The number is greater than 100");
      }else{
        System.out.println("the number is less than or equal to 100");
      }
    }
    else if(n<0){
      System.out.println("The number is a negetive number");
    }
    else{
      System.out.println("The number is zero");
    }
    sc.close();
  }
}
