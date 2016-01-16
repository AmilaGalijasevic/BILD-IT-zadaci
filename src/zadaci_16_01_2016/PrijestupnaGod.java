package zadaci_16_01_2016;

public class PrijestupnaGod {
	
		public static void main(String[] args) {
			int count = 0;
			// racuna i broji koliko ima prijestupnih godina
			for (int i = 101; i < 2100; i++) {
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
					count++;
					System.out.print(i + " ");
					// prelazi u novi red nakon sto ispise 10
					if (count % 10 == 0) {
						System.out.println();
					}
				}
			}
			System.out.println();
			System.out.println("Ukupan broj prijestupnih godina je: " + count);
		}

	

}
