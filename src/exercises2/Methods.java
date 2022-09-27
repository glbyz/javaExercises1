package exercises2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int sayilar[] = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		String mesaj="";
		if (varMi) {
			mesaj="Sayi Mevcuttur : " +aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer(" Sayi Mevcut Değildir : " + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) { //parametreli metod
		System.out.println(mesaj);
	}

}
