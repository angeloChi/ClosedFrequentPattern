package data;

public class DiscreteAttribute extends Attribute {

	private String values[];// array di oggetti String, uno per ciascun valore discreto
	
	
	
	public DiscreteAttribute(String name, int index, String values[]){
	/**Input: valori per nome simbolico dell'attributo, identificativo numerico
	dell'attributo e valori discreti
	Output : //
	Comportamento: Invoca il costruttore della classe madre e
	avvalora l'array values[ ] con i valori discreti in input.
	*/
		super(name,index);
		this.values = values;
		
		
	}
	public int getNumberOfDistinctValues(){
	/**Input: //
	Output : numero di valori discreti dell'attributo
	Comportamento: Restituisce la cardinalit� dell'array values[]
	*/
	return this.values.length;
		
	}
	
	public String getValue(int i){
	/**Input: //
	Output : i-esimo valore discreto dell'array values[]
	Comportamento: Restituisce il valore i-esimo dell'attributo discreto
	*/
	
		return this.values[i];
	
	}
	
	
}
