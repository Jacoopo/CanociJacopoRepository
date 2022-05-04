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
 * @version 2
 *
 */
public class CanociJacopoClass {

	private int s, f;

	/**
	 * Costrutture della classe CanociJacopoClass 
	 * senza attributi
	 */
	public CanociJacopoClass() {

	}

	/**
	 * Metodo che calcola il valore della produttoria tra due numeri
	 * 
	 * @param s Valore che indica il valore iniziale
	 * @param f Valore che indica il valore finale
	 * @return il valore della produttoria
	 */
	public int canociMet(int s, int f) {
		int r = (f * f) * (s * s);
		for (int i = s + 1; i < f; i++) {
			r *= i * i;
			// all'interno di questo metodo gli errori sono: all'inizio dobbiamo mettere = a (f*f) * (s*s) per rispondere alla formula matematica
			//il secondo errore è nel for dobbiamo mettere la i = s+1
			//e l'ultimo errore sta dentro il for dobbiamo mettere l'istruzione uguale e moltiplicata a i*i
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
