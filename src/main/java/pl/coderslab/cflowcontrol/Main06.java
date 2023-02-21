package pl.coderslab.cflowcontrol;

public class Main06 {

	public static void main(String[] args) {
		int o = 0;
		int n = 6;
		while (o <= n) {
			if (o % 2 == 0)
				System.out.println(o + " - even");
			else System.out.println(o + " - odd");
			o++;
		}
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				System.out.println(i + " - even");
			else System.out.println(i + " - odd");


		}
	}
}