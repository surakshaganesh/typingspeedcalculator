import java.util.Scanner;

public class TypingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Get ready to start typing! The countdown begins...");

        // Countdown
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Delay of 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Go!");

        // Start time
        long startTime = System.currentTimeMillis();

        // Simulating user typing (You'll replace this with actual user input)
        System.out.println("Type the sentence: 'The quick brown fox jumps over the lazy dog'");
        String userInput = scanner.nextLine();

        // End time
        long endTime = System.currentTimeMillis();

        // Calculate time taken
        long timeTakenMillis = endTime - startTime;
        double timeTakenMinutes = timeTakenMillis / 60000.0; // Convert to minutes

        // Calculate number of characters
        int numberOfCharacters = userInput.length();

        // Calculate CPM and WPM
        int charactersPerMinute = (int) (numberOfCharacters / timeTakenMinutes);
        int wordsPerMinute = (int) ((numberOfCharacters / 5.0) / timeTakenMinutes); // Average word length is 5 characters

        // Display results
        System.out.println("Time taken: " + timeTakenMinutes + " minutes");
        System.out.println("Number of characters: " + numberOfCharacters);
        System.out.println("Characters per minute (CPM): " + charactersPerMinute);
        System.out.println("Words per minute (WPM): " + wordsPerMinute);

        scanner.close();
    }
}