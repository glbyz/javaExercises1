package exercises1;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi1=266;
		int sayi2=25;
		int sayi3=26;
		
		int enBuyuk=sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}else if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}else {
			enBuyuk=sayi1;
		}
		System.out.println("En Büyük Sayı : " + enBuyuk);
	}

}