package exercises1;

public class MiniProjeAsalSayi {


		public static void main(String[] args) {

			
			int number = 8;
			int j = 0;
			for(double i = 1;i<=number;i++) {
				for(int k=1;k<=number;k++) {
					if(number/i==k) {
						j++;
					}
				}
		
				
			}
			if(j<3) {
				System.out.println(number+" sayısı asaldır.");
			}
			else {
				System.out.println(number+" sayısı asal değildir.");
			}

		}


}
