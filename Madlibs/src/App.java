import java.util.Scanner;
  
public class App {
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
  
      System.out.println("Enter a color: ");
      String color = input.nextLine();
      System.out.println("Enter an adjective: ");
      String adjective = input.nextLine();
      System.out.println("Enter a celebrity: ");
      String celebrity = input.nextLine();
      
      
      System.out.println("Roses are " + color + "\n" 
                         + "Violets are " + adjective + "\n" 
                        + "I love " + celebrity);
    }
  }