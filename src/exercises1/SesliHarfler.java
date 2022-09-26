package exercises1;


public class SesliHarfler {

	public static void main(String[] args) {
		char harf='A';
		
		switch(harf) {
			case 'E':
			case 'e':
			case 'İ':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü':
				System.out.println(harf + " " + "ince seslidir.");
				break;
				default:
					System.out.println(harf + " " + "kalın seslidir.");
		}
		
		

	}

}
