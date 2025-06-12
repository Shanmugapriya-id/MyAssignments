package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		        int n = 8; // Number of terms in the series
		        int first = 0, second = 1;

		        System.out.println("Fibonacci Series up to " + n + " terms:");
		        for (int i = 1; i <= n; i++) {
		            System.out.println(first);

		            // calculating Fibonacci series 
		            int next = first + second;
		            first = second;
		            second = next;
		        }
		    }
		}

