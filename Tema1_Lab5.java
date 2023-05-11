class Joaca {
	private int n;

	public Joaca(int n) {
		this.n = n;
	}

	public void afisare() {
		for (int i = 1; i <= n; i++) { // ce cifra se afiseaza
			for (int j = 0; j <= n - i; j++) { // de cate ori se afiseaza cifra
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

public class Tema1 {

	public static String cautMaximulDinTablou(int[] tablou) {
		int maxim = tablou[0], contor = 0; // initializez variabila maxim cu primul element al tabloului, iar variabila
											// contor cu valoarea 0

		for (int i = 0; i < tablou.length; i++) { // parcurg tabloul
			if (tablou[i] > maxim) { // daca elementul din tablou este mai mare decat valoare maxim, schimb valoarea
										// variabilei maxim
				maxim = tablou[i];
				contor = 1; // dau contorului valoarea 1, deoarece valoarea maxima apara o data deja
			} else if (tablou[i] == maxim) { // daca valoare elementului din tablou este egala cu valoarea maxima
												// incrementez contorul
				contor++;
			}
		}

		return "Maximul din tablou este: " + maxim + " si apare de: " + contor + " ori.";
	}

	public static void main(String[] args) {
		int[] tablou = { 1, 9, 5, 7, 4, 6 };

		// Exercitiu 2
		// Construiti o metoda ce primeste ca parametru un tablou de numere intregi si
		// va afisa valoarea maxima si de cate ori apare aceasta in tablou.

		System.out.println(cautMaximulDinTablou(tablou));;

		// Exercitiu 3
		// Creati o clasa Joaca ce are un atribut privat intreg, n, primit prin
		// constructor. Creati o metoda afisare ce va afisa, pe ecran, numerele sub
		// urmatoarea forma:
		// 1 1 1 1 1
		// 2 2 2 2
		// 3 3 3
		// 4 4
		// 5 (pentru n=5)

		Joaca joc1 = new Joaca(5);
		joc1.afisare();
	}

}
