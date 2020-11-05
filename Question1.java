import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a starting number (Must be an Integer).");

      int num = scan.nextInt();

      num++; 
      System.out.println("Your number is now " + num);
      num++; 
      System.out.println("Your number is now " + num);
      num++; 
      System.out.println("Your number is now " + num);

      num--; 
      System.out.println("Your number is now " + num);
      num--; 
      System.out.println("Your number is now " + num);
      num--; 
      System.out.println("Your number is now " + num);

    }
}