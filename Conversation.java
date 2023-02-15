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
      String newResponse = response.replace( "I ", "you ");
      // String newResponse = String.join(" ");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("I'm")){
      String newResponse = response.replace( "I'm", "you're");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("me")){
      String newResponse = response.replace( "me", "you");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("am")){
      String newResponse = response.replace( "am", "are");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("you")){
      // String[] splitResponse = response.split(" ", 5);
      // String stringResponse = splitResponse.toString();
      String newResponse = response.replace( "you", "I");
      // String newResponse = String.join("You");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("my")){
      String newResponse = response.replace( "my", "your");
      System.out.println(newResponse + "?");
    }

    else if (response.contains("your")){
      String newResponse = response.replace( "your", "my");
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
        String newResponse = nextResponse.replace( "I ", "you ");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("I'm")){
        String newResponse = nextResponse.replace( "I'm", "you're");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("me")){
        String newResponse = nextResponse.replace( "me", "you");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("am")){
        String newResponse = nextResponse.replace( "am", "are");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("you")){
        String newResponse = nextResponse.replace( "you", "I");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("my")){
        String newResponse = nextResponse.replace( "my", "your");
        System.out.println(newResponse + "?");
      }

      else if (nextResponse.contains("your")){
        String newResponse = nextResponse.replace( "your", "my");
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
