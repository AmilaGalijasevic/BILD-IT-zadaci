package zadaci_16_01_2016;

public class Pitanja {

	public static void test(int a) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int temp = 0;
		// daje random vrijednosti od 0 do 9
		for (int i = 0; i < a; i++) {
			int b1 = (int) (Math.random() * 10);
			int b2 = (int) (Math.random() * 10);
			// ako je prvi broj manji od drugog mijenja im mjesta
			if (b1 < b2) {
				temp = b1;
				b1 = b2;
				b2 = temp;
			}
			// ispisuje pitanja sa razlicitim brojevima
			System.out.println("Koliko je: " + b1 + " - " + b2 + "?");
			int odgovor = input.nextInt();
			// privjerava i broji odgovore
			if (odgovor == (b1 - b2)) {
				count1++;
			} else {
				count2++;

			}
		}
		System.out.println("Broj tacnih odgovora: " + count1);
		System.out.println("Broj netacnih odgovora: " + count2);
		input.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Unesite broj pitanja");
			int br = input.nextInt();
			// poziva metodu
			test(br);

		} catch (Exception e) {
			// TODO: handle exception
		}
		input.close();
	}

}
