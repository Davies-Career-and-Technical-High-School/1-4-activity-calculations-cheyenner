import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a number of inches (Integer): ");
      int num1 = scan.nextInt();
      int num2 = num1 /12;
      System.out.print("There are " + num2 + " ft in " + num1 + " Inches.");
    }
}