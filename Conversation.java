import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class Conversation {

  /**
   * Public main method that doesn't return anything (void) and has static keyword. Takes in an array of type string.
   * @param arguments Unused
   */
  public static void main(String[] arguments) {
    /**
     * Scanner is used to get user input
     */
    Scanner input = new Scanner(System.in); 
    /**
     * Random is used to generate random numbers 
     */
    Random random = new Random();
    /** 
     * ArrayList is a resizable array that takes in a string 
     */
    ArrayList<String> transcript = new ArrayList<String>();
    System.out.println("How many rounds do you want to do? ");
    /**
     * input.nextInt() is used to get the next randomized integer value 
     */
    int numRounds = input.nextInt();
    /**
     * input.nextLine() clears out the return line
     */
    input.nextLine(); 
    System.out.println("Hi! What's on your mind?");
    /**
     * transcript.add() appends the value of e into the array transcript
     */
    transcript.add("Hi! What's on your mind?");
    /**
     * String class of type array 
     */
    String[] cannedResponses = new String[] {"Wow, really?", "I see", "Hmm, interesting"};

    for (int i = 0; i < numRounds; i++) {
      String response = input.nextLine(); 
      /**
      * response.split() splits the string into an array using the given regex
      */
      String[] splitResponse = response.split(" ");
      transcript.add(response);

      /**
       * splitResponse.length is an array method that helps us obtain the size of the array
       */
      for (int index = 0; index < splitResponse.length; index++){
        /**
         * splitResponse[index].equals() checks to see if each index in the array splitResponse equals the given value of anObject
         */
        if (splitResponse[index].equals("I")) {
          /**
           * splitResponse[index].replace() replaces the target value in the index with the replacement value 
           */
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
    /**
     * String.join() combines the array into a string using the given delimiter 
     */
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

  /**
  * Closes the Scanner 
  */
  input.close();
}

}
