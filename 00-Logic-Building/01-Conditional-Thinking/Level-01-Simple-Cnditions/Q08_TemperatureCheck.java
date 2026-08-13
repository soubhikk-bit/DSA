
import java.util.Scanner;

public class Q08_TemperatureCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature");
    int n = sc.nextInt();

    if(n>=0 && n <= 21)
      System.out.println("weather is cold");
    else if(n>=22 && n<= 29)
      System.out.println("weather is warm");
    else 
      System.out.println("weather is hot");
  }
}
