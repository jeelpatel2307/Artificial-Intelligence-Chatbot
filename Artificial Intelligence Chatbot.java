import java.util.Scanner;

public class Chatbot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Chatbot! How can I assist you today?");
        
        while (true) {
            String userInput = scanner.nextLine().toLowerCase();
            
            // Exit condition
            if (userInput.equals("exit")) {
                System.out.println("Goodbye! Have a great day.");
                break;
            }
            
            // Chatbot responses based on user input
            String response = getResponse(userInput);
            System.out.println(response);
        }
        
        scanner.close();
    }
    
    public static String getResponse(String userInput) {
        String response = "I'm sorry, I don't understand. Could you please rephrase?";
        
        // Simple chatbot logic - replace with more sophisticated AI logic as needed
        if (userInput.contains("hello") || userInput.contains("hi")) {
            response = "Hello! How can I help you?";
        } else if (userInput.contains("how are you")) {
            response = "I'm just a computer program, so I don't have feelings, but I'm here to assist you!";
        } else if (userInput.contains("thanks") || userInput.contains("thank you")) {
            response = "You're welcome!";
        }
        
        return response;
    }
}
