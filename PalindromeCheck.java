package methods.objects;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121; // You can change this to test other numbers
        int output = 0;
        int rem;

        // Using a for loop to reverse the digits
        for (int i = input; i > 0; i = i / 10) {
            rem = i % 10;               // Get the last digit
            output = output * 10 + rem; // Build the reversed number
        }

        // Check if the input and reversed number are the same
        if (input == output) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
	}

}
