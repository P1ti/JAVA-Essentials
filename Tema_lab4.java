import java.util.Arrays;

// Problema 2
class Persoana {
	private String nume;
	private int varsta;

	public Persoana() {
		this.nume = "Iosif";
		this.varsta = 20;
	}

	public Persoana(String nume) {
		this.nume = nume;
	}

	public Persoana(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
}

// Problema 3
class Numere {
	private double numar1;
	private double numar2;

	public Numere(double numar1, double numar2) {
		this.numar1 = numar1;
		this.numar2 = numar2;
	}

	public void calculezMedia() {
		double media = (numar1 + numar2) / 2;
		System.out.println("Media numerelor este: " + media);
	}
}

public class Tema {

	public static int[] cautElementeComune(int[] tablou1, int[] tablou2) {
		int[] tablouNou = new int[Math.min(tablou1.length, tablou2.length)]; // Aflu care tablou are dimensiunea mai
																				// mica si o folosesc pentru a crea un
																				// tablou care se initializarea automat
																				// cu 0
		int indexTablouNou = 0;

		for (int i = 0; i < tablou1.length; i++) { // Parcurg elementele din primul tablou si le compar cu cele din al
													// doilea
			for (int j = 0; j < tablou2.length; j++) {
				if (tablou1[i] == tablou2[j]) {
					tablouNou[indexTablouNou] = tablou1[i]; // daca gasesc un element identic din primul tablou cu unul
															// din al doilea tablou il adaug in tabelul pe care l-am
															// creat
					indexTablouNou++; // incrementez variabila pentru ca urmatorul element comun sa fie pus pe pozitia
										// urmatoare
					break;
				}
			}
		}

		int[] rezultat = new int[indexTablouNou]; // mai creez un tablou in care adaug valorile si elimin elementele de
													// 0

		for (int i = 0; i < indexTablouNou; i++) {
			rezultat[i] = tablouNou[i];
		}

		return rezultat;
	}

	public static void afluGrupeleDeNumere(int[] tablou1, int numar) {
		int suma = 0;
		for (int i = 0; i < tablou1.length; i++) {
			for (int j = i + 1; j < tablou1.length; j++) {
				suma = tablou1[i] + tablou1[j];
				if (suma == numar) {
					System.out.println("Perechea: " + " (" + tablou1[i] + "," + tablou1[j] + ")");
				}
			}
		}
	}

	public static int[] cautElementeleMaiMari(int[] tablou1) {
		int[] tablouNou = new int[tablou1.length];
		int indexTablouNou = 0;

		for (int i = 0; i < tablou1.length; i++) { // Parcurg tabloul primit ca parametru si daca gasesc o valoare peste
													// 100 o stochez in tablouNou si incrementez variabila
													// indexTablouNou
			if (tablou1[i] > 100) {
				tablouNou[indexTablouNou] = tablou1[i];
				indexTablouNou++;
			}
		}

		int[] rezultat = new int[indexTablouNou];

		for (int i = 0; i < indexTablouNou; i++) { // Creez tabloul rezultat si stochez in el valorile din tablouNou
													// eliminand elementele 0
			rezultat[i] = tablouNou[i];
		}

		return rezultat;
	}

	public static int[] eliminElementeleIdentice(int[] tablou1, int numar) {
		for (int i = 0; i < tablou1.length; i++) { // Parcurg tabloul si daca vreun element este identic cu numarul
													// primit parametru il inlocuiesc cu 0
			if (tablou1[i] == numar) {
				tablou1[i] = 0;
			}
		}

		for (int i = 0; i < tablou1.length; i++) { // Parcurg tabloul si cand gasesc un element egal cu 0 il interschimb
													// cu valoarea care urmeaza
			for (int j = i + 1; j < tablou1.length; j++) {
				if (tablou1[i] == 0) {
					tablou1[i] = tablou1[j];
					tablou1[j] = 0;
				}
			}
		}

		return tablou1;
	}

	public static void main(String[] args) {
		// Problema 1
		// Construiti o metoda care primeste ca parametru doua tablouri si returneaza un
		// nou tablou cu elementele comune din el.
		int[] tablou1 = { 5, 120, 2, 4, 3, 7, 2 }, tablou2 = { 7, 10, 5, 12, 5, 3 };
		System.out.println("Rezultatul este: " + Arrays.toString(cautElementeComune(tablou1, tablou2)));

		// Problema 3
		Numere numere = new Numere(1.2, 1.2);
		numere.calculezMedia();

		// Problema 4
		// Construiti o metoda care primeste ca parametru un tablou de numere intregi si
		// un parametru de tip intreg, reprezentand o anumita valoare. Afisati toate
		// perechile de elemente din tablou a caror suma este egala cu acea valoare.
		int numar = 7;
		System.out.println("Rezultatele sunt: ");
		afluGrupeleDeNumere(tablou1, numar);

		// Problema 5
		// Construiti o metoda care primeste ca parametru un tablou si va returna un nou
		// tablou format din numerele mai mari decat 100 din tabloul primit ca
		// parametru.
		System.out.println("Rezultatul este " + Arrays.toString(cautElementeleMaiMari(tablou1)));

		// Problema 6
		// Construiti o metoda care primeste ca parametru un tablou de numere intregi
		// distincte si un alt parametru, un numar intreg. Daca acel numar se afla in
		// tablou va trebui sters din tabloul original
		numar = 2;
		System.out.println("Rezultatul este " + Arrays.toString(eliminElementeleIdentice(tablou1, numar)));
	}
}
