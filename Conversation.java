import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in); 
    Random random = new Random();
    ArrayList<String> transcript = new ArrayList<String>();
    System.out.println("How many rounds do you want to do? ");
    int numRounds = input.nextInt();
    input.nextLine(); 
    // clearing out the return line
    System.out.println("Hi! What's on your mind?");
    transcript.add("Hi! What's on your mind?");
    String[] cannedResponses = new String[] {"Wow, really?", "I see", "Hmm, interesting"};


    for (int i = 0; i < numRounds; i++) {
      String response = input.nextLine(); 
      String[] splitResponse = response.split(" ");
      transcript.add(response);

      for (int index = 0; index < splitResponse.length; index++){
        if (splitResponse[index].equals("I")) {
          splitResponse[index] = splitResponse[index].replace("I", "you");
        }

        else if (splitResponse[index].equals("I'm")) {
          splitResponse[index] = splitResponse[index].replace("I'm", "you're");
        }

        else if (splitResponse[index].equals("me")) {
          splitResponse[index] = splitResponse[index].replace("me", "you");
        }

        else if (splitResponse[index].equals("am")) {
          splitResponse[index] = splitResponse[index].replace("am", "are");
        }

        else if (splitResponse[index].equals("are")) {
          splitResponse[index] = splitResponse[index].replace("are", "am");
        }

        else if (splitResponse[index].equals("you")) {
          splitResponse[index] = splitResponse[index].replace("you", "I");
        }

        else if (splitResponse[index].equals("my")) {
          splitResponse[index] = splitResponse[index].replace("my", "your");
        }

        else if (splitResponse[index].equals("your")) {
          splitResponse[index] = splitResponse[index].replace("your", "my");
        }

        }
      String output = String.join(" ", splitResponse);
      
      if (output.equals(response)) {
        int rand = random.nextInt(cannedResponses.length);
        System.out.println(cannedResponses[rand]);
        transcript.add(cannedResponses[rand]);
      }
      else {
        System.out.println(output);
        transcript.add(output);
        }
    }

    System.out.println("Bye!");
    transcript.add("Bye!");
    System.out.println(transcript);


  input.close();
}

}
