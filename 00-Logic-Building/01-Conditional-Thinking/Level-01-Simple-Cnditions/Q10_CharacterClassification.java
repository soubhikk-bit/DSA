import java.util.Scanner;

public class Q10_CharacterClassification {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("The character is uppercase");

        } else if (ch >= 'a' && ch <= 'z') {

            System.out.println("The character is lowercase");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println("The character is a digit");

        } else {

            System.out.println("The character is a special character");
        }

        sc.close();
    }
}
