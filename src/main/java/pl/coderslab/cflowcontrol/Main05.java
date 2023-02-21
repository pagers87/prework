package pl.coderslab.cflowcontrol;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		int w = 0;
		for (int f=1; f<=10; f++)
			resultFor = resultFor + f;

		while (w <10) {
			w++;
			resultWhile += w;
		}
		System.out.println(resultFor);
		System.out.println(resultWhile);
	}

}
