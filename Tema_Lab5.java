class ExercitiuToString {
	private int numar;
	
	public ExercitiuToString(int n) {
		this.numar = n;
	}
	
	public int getNumar() {
		return this.numar;
	}
	
	public void setNumar(int n) {
		this.numar = n;
	}
	
	public String toString() {
		return "Valoarea este " + this.numar;
	}
}

class PatratComplex {
	private int latura;
	private static int numarDeObiecte = 0;
	
	public PatratComplex() {
		this.latura = 5;
		numarDeObiecte++;
	}
	
	public PatratComplex(int n) {
		this.latura = n;
		numarDeObiecte++;
	}
	
	private int calculezPerimetrul() {
		int perimetru = this.latura * 4;
		return perimetru;
	}
	
	private int calculezAria() {
		int arie = this.latura * this.latura;
		return arie;
	}
	
	public void afisezRezultate() {
		System.out.println("Perimetru: " + this.calculezPerimetrul() + ". Arie: " + this.calculezAria());
	}
	
	public static int numarDeObiecte() {
		return numarDeObiecte;
	}
}


class Priza {
	private int tensiune;
	
	public Priza(int tensiune) {
		this.tensiune = tensiune;
	}
	
	public void setTensiune(int t) {
		this.tensiune = t;
	}
	
	public int getTensiune() {
		return this.tensiune;
	}
	
}

public class Tema {

	public static void main(String[] args) {
		// Exercitiu 1
		ExercitiuToString nr1 = new ExercitiuToString(12);
		System.out.println(nr1.toString());
		
		// Exercitiu 2
		PatratComplex patrat1 = new PatratComplex();
		patrat1.afisezRezultate();
		System.out.println("Exista " + PatratComplex.numarDeObiecte() + " obiecte");
		// Raspuns exercitiu 4: 100
		
	
		Priza p1, p2, p3; // trei referinte
		p1 = new Priza(200); // am instantiat obiectul p1
		p2 = p1; // p2 indica catre obiectul p1
		p2.setTensiune(400); // referintei p2 i se atribuite tensiunea 400
		p3 = p2; // p3 indica catre obiectul p2 
 		p3.setTensiune(100); // referintei p3 i se atribuie tensiunea 100
		System.out.println(p1.getTensiune()); // se afiseaza 100
		// Obiectul este cand apare cuvantul new linia 87
	}

}
