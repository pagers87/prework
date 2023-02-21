package pl.coderslab.darrays;

public class Main06 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, -69};
		for (int i = 4; i <= numbers.length; i--) {
			if (i == -1)
				break;
			System.out.println(numbers[i]);
		}

	}
}
