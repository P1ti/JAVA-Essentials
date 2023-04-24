import java.util.Arrays;

public class Tema {

	public static double calculezMedia(int[] tablou) {
		int suma = 0;
		for (int i = 0; i < tablou.length; i++) {
			suma += tablou[i];
		}
		double media = suma / tablou.length;
		return media;
	}

	public static int[] inversezElementele(int[] tablou) {
		int[] tablouInversat = new int[tablou.length];
		// 0 = 4; 1 = 3; 2 = 2; 3 = 1; 4 = 0
		int i = 0; int j = tablou.length - 1;
		while (i<tablou.length) { 
			tablouInversat[i] = tablou[j];
			i++;
			j--;
		}
		return tablouInversat;
	}

	public static int afluNumereInInterval(int[] tablou) {
		int nrInInterval = 0;
		for (int i = 0; i < tablou.length; i++) {
			if ((tablou[i] >= 1) && (tablou[i] <= 100)) {
				nrInInterval++;
			}
		}
		return nrInInterval;
	}

	public static int afluNrMax(int[] tablou) {
		int nrMax = tablou[0]; // initializez cu primul nr din tablou pentru ca daca e zero s-ar putea ca acesta sa nu apartina intervalului
		for (int i = 0; i < tablou.length; i++) {
			if (tablou[i] > nrMax) {
				nrMax = tablou[i];
			}
		}
		return nrMax;
	}

	public static int calculezNrPare(int[] tablou) {
		int nrPare = 0;
		for (int i = 0; i < tablou.length; i++) {
			if (tablou[i] % 2 == 0) {
				nrPare++;
			}
		}
		return nrPare;
	}

	public static int sumaElementelor(int[] tablou) {
		int suma = 0;
		for (int i = 0; i < tablou.length; i++) {
			suma += tablou[i];
		}
		return suma;
	}

	public static int[] creezMetoda(int numarDeElemente, int valoare) {
		int[] tablou = new int[numarDeElemente];
		for (int i = 0; i < tablou.length; i++) {
			tablou[i] = valoare;
		}
		return tablou;
	}

	public static void afisezElementele(int[] tablou) {
		for (int i = 0; i < tablou.length; i++) {
			System.out.print(tablou[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] tablou = { 5, 8, 5, 0, 2 }, rezultat;
		int valoare = 0;

		System.out.println("-- Problema 1 --");

		for (int i = 0; i < tablou.length; i++) {
			System.out.print(tablou[i] + " ");
		}

		System.out.println("");
		System.out.println("-- Problema 2 --");

		afisezElementele(tablou);

		System.out.println("");
		System.out.println("-- Problema 3 --");

		int numarDeElemente = 5;
		rezultat = creezMetoda(numarDeElemente, 2);
		System.out.println(Arrays.toString(rezultat));

		System.out.println("-- Problema 4 --");

		valoare = sumaElementelor(tablou);
		System.out.println("Suma elementelor din tablou este: " + valoare);

		System.out.println("-- Problema 5 --");

		valoare = calculezNrPare(tablou);
		System.out.println("Exista " + valoare + " numere pare in tablou");

		System.out.println("-- Problema 6 --");

		System.out.println("Numarul maxim din tablou este: " + afluNrMax(tablou));

		System.out.println("-- Problema 7 --");

		valoare = afluNumereInInterval(tablou);
		System.out.println("Exista " + valoare + " numere in intervalul [1,100]");

		System.out.println("-- Problema 8 --");

		int[] inversulTabloului = inversezElementele(tablou);
		System.out.println(Arrays.toString(inversulTabloului));

		System.out.println("-- Problema 9 --");

		System.out.println("Media elementelor din tablou este: " + calculezMedia(tablou));
	}

}
