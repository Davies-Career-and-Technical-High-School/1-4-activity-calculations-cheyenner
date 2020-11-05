import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a price: ");
      double p = scan.nextDouble();
      double c = 20.0;

      double f = c - p;

      System.out.println("Change from $20: $" + f   );

    }
}