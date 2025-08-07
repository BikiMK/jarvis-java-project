package core;

import java.util.Scanner;

public class ChatEngine {
    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jarvis: Hello, I am online. How can I help you?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Jarvis: Goodbye, Sir!");
                break;
            }

            String response = getAIResponse(userInput);
            System.out.println("Jarvis: " + response);
        }

        scanner.close();
    }

    private String getAIResponse(String input) {
        // For now, just a placeholder response
        return "I will process: " + input;
    }
}
