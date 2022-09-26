package exercises1;

import java.util.Arrays;
import java.util.Iterator;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf='ö';
		
		char inceHarfler []= {'e','E','i','İ','ö','Ö','ü','Ü'};
		char kalinHarfler []= {'a','A','ı','I','o','O','u','U'};
		
		boolean a=false;
		for(char ince : inceHarfler) {
			if(ince==harf) {
				a=true;
				break;
			}
		}
		
		if(a) {
			System.out.println(harf + " " + "ince seslidir.");
		}else {
			System.out.println(harf + " " + "kalın seslidir.");
		}
		
		

	}

}
