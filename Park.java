import java.util.Scanner;
public class Park
{
    public static void main(String[] args)
     {
    System.out.println("Input sound heard");
    try (Scanner scanner = new Scanner(System.in)) {
        {
            String name = scanner.nextLine();
                
                switch (name)  
                {
                    case "Grr Grr":
                    System.out.print("Lion Lion");
                    break;
                    case "Rawr Rawr":
                    System.out.print("Tiger");
                    break;
                    case "Ssss":
                    System.out.print("Snake");
                    break;
                    case "Chirp Chirp":
                    System.out.print("Birds");
                    break;
                    case "Grr Grr Rawr Ssss Chirp":
                    System.out.println("Lion Lion Tiger Snake Birds");
                    default:
                    System.out.print("Try again later");
                    break;
                }
        }
    }
        
    }
}