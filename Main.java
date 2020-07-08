import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    Second SecondObject = new Second();
    System.out.println("What is your favorite drink?");
    String drink = input.nextLine();
    SecondObject.setName(drink);
    SecondObject.saying();
  }
}