
public class Tema2 {

	public static void afisezLideriiDinTablou(int[] tablou) {
		int lider = tablou[tablou.length - 1];
		System.out.println("Liderii sunt: ");
		for (int i = tablou.length-2; i >= 0; i--) {
			if (tablou[i] > lider) {
				lider = tablou[i];
				System.out.println(lider);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablou = { 1, 5, 7, 9, 4, 2 };

		afisezLideriiDinTablou(tablou);
	}

}
