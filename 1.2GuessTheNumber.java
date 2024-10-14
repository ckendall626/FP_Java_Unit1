import java.util.*;
class GuessTheNumber {
  public static void main() {
    //Include your code for part 3 here. Incude comments describing your process
    Scanner consoleInput = new Scanner(System.in);
    System.out.print("Please type your name:");
    String username = consoleInput.next ();
    int answer = (int) (Math.random() * 10 + 1);
    int attempts = 0;
    System.out.print("Guess a number between 1 and 11: ");
    while (consoleInput.hasNext()){
      if (!consoleInput.hasNextInt()){
        System.out.print("That is not a valid integer. please type a valid integer: ");
        consoleInput.nextLine();
        attempts += 1;
        continue;
      }
      int input = consoleInput.nextInt();
      if (input == answer){
        attempts += 1;
        System.out.println("You are correct! The answer was: " + answer);
        break;
      }
      else {
        System.out.print("Incorrect. Please try again:");
        attempts += 1;
        consoleInput.nextLine();
      }
    }
    System.out.println("Thank you for playing " + username + "!");
    System.out.println("Attempts: " + attempts);
} 
}