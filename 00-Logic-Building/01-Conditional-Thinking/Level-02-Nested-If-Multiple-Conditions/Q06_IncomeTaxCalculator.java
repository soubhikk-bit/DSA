
import java.util.Scanner;

public class Q06_IncomeTaxCalculator {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your income");
    int n = sc.nextInt();

    if(n<=250000){
      System.out.println("You don't fall into the tax slab");
    }
    else if(n<=500000){
      System.out.println("your total tax for this year is : " + (n*5)/100);
    }
    else if(n<=1000000){
      System.out.println("your total tax for this year is : " + (n*20)*100);
    }
    else{
      System.out.println("your total tax for this year is : " + (n*30)/100);
    }
    sc.close();
  }
}
