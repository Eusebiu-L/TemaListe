import java.util.LinkedList;

public class CosCumparaturi {
	private LinkedList<Produs> listaProduse;
	
	public CosCumparaturi() {
		this.listaProduse = new LinkedList<>();
	}
	public void adaugaProdus(Produs produs) {
		listaProduse.add(produs);
	}
	public void afisareProdus() {
		System.out.println("Avem urmatoarele produse in lista: ");
		for(Produs produs: listaProduse) {
			System.out.println(produs.getNume() + produs.getPret());
		}
	}
	public void calculeazaTotal() {
		double total = 0.0;
		for(Produs produs:listaProduse) {
			total += produs.getPret();
		}
		System.out.println(total);
	}
	public static void testCosCumparaturi() {
		CosCumparaturi cos = new CosCumparaturi();
		
		cos.adaugaProdus(new Produs("Iphone, ", 1854));
		cos.adaugaProdus(new Produs("Laptop, ", 1956));
		
		cos.afisareProdus();
		cos.calculeazaTotal();
	}
	

	public static void main(String[] args) {
		testCosCumparaturi();
		
	}

}
