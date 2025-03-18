public class MethodReturnTypes {
    public static void main(String[] args) {
        // Call the displayWelcomeMessage method
        displayWelcomeMessage();

        // Declare variables for calculation
        int value1 = 20;
        int value2 = 30;

        // Call the calculateAverage method and store the result
        double result = calculateAverage(value1, value2);

        // Print the calculated average
        System.out.println("The average is: " + result);
    }

    // Method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}
