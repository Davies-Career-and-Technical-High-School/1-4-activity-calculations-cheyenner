import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a radius: ");
    
      double r = scan.nextDouble();

      double c = 2 * 3.14 * r ;

      double a = 3.14 * r * r;

      System.out.println("Circumference: " + c);
      System.out.println("Area : " + a);

    }
}