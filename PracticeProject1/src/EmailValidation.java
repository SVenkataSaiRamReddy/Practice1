import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        // Sample array of email IDs
        String[] emailArray = {
                "ram@example.com",
                "subhi@example.com",
                "vabs@example.com",
                // Add more email IDs as needed
        };

        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Calling the search method to find the index
        int index = findEmailIndex(emailArray, searchEmail);

        // Displaying the search result
        if (index != -1) {
            System.out.println("Email ID found at index: " + index);
        } else {
            System.out.println("Email ID not found in the array.");
        }
    }

    // Method to find the index of an email ID in the array
    public static int findEmailIndex(String[] emailArray, String searchEmail) {
        for (int i = 0; i < emailArray.length; i++) {
            if (emailArray[i].equalsIgnoreCase(searchEmail)) {
                return i;
            }
        }
        return -1;
    }
}
