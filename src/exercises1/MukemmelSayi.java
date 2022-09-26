package exercises1;

public class MukemmelSayi {

	public static void main(String[] args) {
		//6-->1,2,3-->1+2+3=6
		
		int number=5;
		int toplamSayi=0;
		for(int i=1; i<number; i++)  {
			if(number % i==0) {
				toplamSayi=toplamSayi+i;
			}
			
		}
		if (toplamSayi==number) {
			System.out.println(number + " " + "Mükemmel Sayidir");
		}else {
			System.out.println(number + " " + "Mükemmel Sayi Değildir");
		}
	}

}
