
public class Tema_lab2 {

	public static void main(String[] args) {
		System.out.println("-- Problema 1 --");

		int i = 10;
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}

		System.out.println(" ");

		i = 10;
		do {
			System.out.print(i + " ");
			i--;
		} while (i > 0);

		System.out.println(" ");

		for (i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println(" ");

		System.out.println("-- Problema 2 --");

		i = 7;
		while (i > 0) {
			System.out.println("Invat programare");
			i--;
		}

		System.out.println("---");

		i = 7;
		do {
			System.out.println("Invat programare");
			i--;
		} while (i > 0);

		System.out.println("---");

		for (i = 7; i > 0; i--) {
			System.out.println("Invat programare");
		}

		System.out.println("-- Problema 3 --");

		i = 1;
		while (i <= 31) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println(" ");
		i = 1;
		do {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= 31);

		System.out.println(" ");

		for (i = 1; i <= 31; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println(" ");

		System.out.println("-- Problema 4 --");

		int suma = 0;
		i = 1;
		while (i <= 10) {
			suma += i;
			i++;
		}
		System.out.println("Suma primilor 10 termeni este: " + suma);

		suma = 0;
		i = 1;
		do {
			suma += i;
			i++;
		} while (i <= 10);
		System.out.println("Suma primilor 10 termeni este: " + suma);

		suma = 0;
		for (i = 1; i <= 10; i++) {
			suma += i;
		}
		System.out.println("Suma primilor 10 termeni este: " + suma);

		System.out.println("-- Problema 5 --");

		int factorial = 1;
		i = 1;
		while (i <= 10) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorialul primilor este termeni este: " + factorial);

		factorial = 1;
		i = 1;
		do {
			factorial *= i;
			i++;
		} while (i <= 10);
		System.out.println("Factorialul primilor este termeni este: " + factorial);

		factorial = 1;
		for (i = 1; i <= 10; i++) {
			factorial *= i;
		}
		System.out.println("Factorialul primilor este termeni este: " + factorial);

		System.out.println("-- Problema 6 --");

		i = 5;
		suma = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				suma += i;
			}
			i++;
		}
		System.out.println("Suma termenilor pari din intervalul [5;20] este: " + suma);

		i = 5;
		suma = 0;
		do {
			if (i % 2 == 0) {
				suma += i;
			}
			i++;
		} while (i <= 20);
		System.out.println("Suma termenilor pari din intervalul [5;20] este: " + suma);

		suma = 0;
		for (i = 5; i <= 20; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}
		System.out.println("Suma termenilor pari din intervalul [5;20] este: " + suma);

		System.out.println("-- Problema 7 --");

		i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println("Numarul " + i + " este par");
			} else {
				System.out.println("Numarul " + i + " este impar");
			}
			i++;
		}

		System.out.println("---");

		i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println("Numarul " + i + " este par");
			} else {
				System.out.println("Numarul " + i + " este impar");
			}
			i++;
		} while (i <= 20);

		System.out.println("---");

		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Numarul " + i + " este par");
			} else {
				System.out.println("Numarul " + i + " este impar");
			}
		}

		System.out.println("-- Problema 8 --");

		int numereImpare = 0;
		for (i = 34; i <= 57; i++) {
			if (i % 2 != 0) {
				numereImpare++;
			}
		}
		System.out.println("In intervalul [34, 57] sunt " + numereImpare + " numere impare");

		System.out.println("-- Problema 9 --");

		int numereDivizibile = 0;
		for (i = 5; i <= 25; i++) {
			if (i % 3 == 0) {
				numereDivizibile++;
			}
		}
		System.out.println("In intervalul [5,25] sunt " + numereDivizibile + " numere divizibile cu 3");

		System.out.println("-- Problema 10 --");
		// Problema: Am un vector cu valori de la 1 pana la 9, valorile care sunt mai
		// mari decat 5 le voi inlocui cu 1, iar pe cele mai mici decat 5 cu 0. OBS: 5 nu se schimba deloc.
		int[] numereIntregi = {1, 9, 5, 5, 2};
		for (i = 0; i < numereIntregi.length; i++) {
			System.out.print(numereIntregi[i] + " ");
		}
		System.out.println(" ");
		for (i = 0; i < numereIntregi.length; i++) {
			if (numereIntregi[i] > 5) {
				numereIntregi[i] = 1;
			} else if (numereIntregi[i] < 5) {
				numereIntregi[i] = 0;
			}
			System.out.print(numereIntregi[i] + " ");
		}

		System.out.println(" ");

		System.out.println("-- Problema extra 1 --");

		int numarIntreg = 6079;
		i = 0;
		while (numarIntreg != 0) { // cat timp numarul este diferit de 0, blocul de cod va rula
			if ((numarIntreg % 10) > 5) { // citeste ultima cifra si o compara cu 5. Daca aceasta este mai mare adaug o
											// valoare la i
				i++;
			}
			numarIntreg /= 10; // elimin ultima cifra a numarului intreg
		}
		System.out.println("Numarul dat are " + i + " cifre mai mari decat 5");

		System.out.println("-- Problema extra 2 --");

		numarIntreg = 154690786;
		int cifraMaxima = 0;
		while (numarIntreg != 0) {
			if ((numarIntreg % 10) > cifraMaxima) { // daca cifra maxima este mai mica decat ultima cifra a numarului,
													// schimb valoare variabilei cifraMaxima cu valoare ultimei cifre a
													// numarului
				cifraMaxima = (numarIntreg % 10);
			}
			numarIntreg /= 10; // elimin ultima cifra a numarului
		}

		System.out.println("Cifra cea mai mare a numarului dat este " + cifraMaxima);

	}

}
