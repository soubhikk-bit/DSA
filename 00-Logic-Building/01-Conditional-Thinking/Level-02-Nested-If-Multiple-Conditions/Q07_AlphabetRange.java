
import java.util.Scanner;

public class Q07_AlphabetRange {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    char c = sc.next().charAt(0);

    if(c>='a' && c<='m'){
      System.out.println("your character is lies between a and m");
    }
    else if(c>='n' && c<='z'){
      System.out.println("your character is lies between n and z");
    }
    else{
      System.out.println("invalid input");
    }
  }
}
