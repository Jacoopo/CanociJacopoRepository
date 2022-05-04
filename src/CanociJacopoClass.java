/**
 * Classe Principale CanociJacopoClass
 * 
 * <html>
 * 
 * @author <b>Canoci Jacopo</b> <u>4AI</u> <i>04/05/2022</i>
 *         <h2>Funzioni</h2>
 *         <ol>
 *         <li>canociMet(int s, int f)
 *         </ol>
 *         </html>
 *         @version 0
 *
 */
public class CanociJacopoClass {

	private int s, f;

	/**
	 * Costrutture della classe CanociJacopoClass
	 */
	public CanociJacopoClass() {

	}

	/**
	 * Metodo che calcola il valore della produttoria tra due numeri
	 * @param s Valore che indica il valore iniziale
	 * @param f Valore che indica il valore finale
	 * @return il valore della produttoria
	 */
	public int canociMet(int s, int f) {
		int r = 0;
		for (int i = 1; i < f; i++) {
			r = f * i;
		}
		return r;
	}

	public String toString() {
		String s = "";
		s += "INDICE INIZIALE: " + s + "\n";
		s += "INDICE FINALE: " + f + "\n";
		return s;
	}

	public static void main(String[] args) {
		CanociJacopoClass c = new CanociJacopoClass();
		System.out.println("Il risultato e': " + c.canociMet(5, 7));

	}

}
