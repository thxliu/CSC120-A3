import java.util.Random;
import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in); 
    System.out.println("How many rounds do you want to do? ");
    int numRounds = input.nextInt();
    Scanner userInput = new Scanner(System.in);
    System.out.println("Hi! What's on your mind?");
    String response = userInput.nextLine(); 
    String[] cannedResponses = new String[] {"Wow, really?", "I see", "Hmm, interesting"};

    if (response.contains("I ")){
      // String[] splitResponse = response.split(" ", 5);
      // String stringResponse = splitResponse.toString();
      String newResponse = response.replace( "I ", "You ");
      // String newResponse = String.join("You");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("I'm")){
      // String[] splitResponse = response.split(" ", 5);
      // String stringResponse = splitResponse.toString();
      String newResponse = response.replace( "I'm", "You're");
      // String newResponse = String.join("You");
      System.out.println(newResponse + "?");
    }

    else {
      Random random = new Random();
      int index = random.nextInt(cannedResponses.length);
      System.out.println(cannedResponses[index]);
    }
    int i = 0;
    // while (i < numRounds) {
    for (i = 1; i < numRounds; i++) {
      Scanner nextInput = new Scanner(System.in);
      String nextResponse = nextInput.nextLine();

      if (nextResponse.contains("I ")){
        // String[] splitResponse = response.split(" ", 5);
        // String stringResponse = splitResponse.toString();
        String newResponse = nextResponse.replace( "I ", "You ");
        // String newResponse = String.join("You");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("I'm")){
        // String[] splitResponse = response.split(" ", 5);
        // String stringResponse = splitResponse.toString();
        String newResponse = nextResponse.replace( "I'm", "You're");
        // String newResponse = String.join("You");
        System.out.println(newResponse + "?");
      }

      else {
        Random random = new Random();
        int index = random.nextInt(cannedResponses.length);
        System.out.println(cannedResponses[index]);
      }


    }
  
  if (i == numRounds) {
    System.out.println("Bye!");
    }

  }
}
