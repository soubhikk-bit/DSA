
import java.util.Scanner;

public class Q05_ElectricityBill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your total electricity unit consumed");
    int n = sc.nextInt();

    if(n<0){
      System.out.println("Enter a valid unit");
    }
    else if(n<=100){
      System.out.println("your total consumed unit is :" + n + " and your electricity bill is :" + (n*5));
    }
    else if(n<=200){
      System.out.println("your total consumed unit is :" + n + " and your electricity bill is :" + (n*7));
    }
    else if(n<=300){
      System.out.println("your total consumed unit is :" + n + " and your electricity bill is :" + (n*10));
    }
    else if( n>300){
      System.out.println("your total consumed unit is :" + n + " and your electricity bill is :" + (n*12));
    }
    sc.close();
  }
}
