package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 13 are:");
        for (int num = 2; num <= 13; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count = count+1;
                }
            }

            if (count == 2) {
            	
                System.out.println(num);
            }
        }
		// TODO Auto-generated method stub

	}

}
