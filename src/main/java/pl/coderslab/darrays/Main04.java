package pl.coderslab.darrays;

public class Main04 {

	public static void main(String[] args) {
		int sumOdd = 0;
		int[] numbers = {4, 643, 112, 9999, 69};
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] % 2 == 0){
				System.out.println(numbers[i]);}
			if (numbers[i] % 2 == 1){
				sumOdd = (numbers[i] + sumOdd);
			}
		}
		System.out.println(sumOdd);

	}

}

