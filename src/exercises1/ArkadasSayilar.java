package exercises1;

public class ArkadasSayilar {

	public static void main(String[] args) {

		int a = 222;
		int b = 284;
		int total = 0;
		int total2 = 0;

		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				total = total + i;
			}
		}

		for (int j = 1; j < a; j++) {
			if (b % j == 0) {
				total2 = total2 + j;
			}
		}

		if (a == total2 && b==total) {
			System.out.println(a + " ve " + b + " " + "Arkadaş Sayılardır.");
		}else {
			System.out.println(a + " ve " + b + " " + "Arkadaş Sayı Değildlir.");
		}

	}

}
