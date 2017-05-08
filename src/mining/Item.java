package mining;

import data.Attribute;

public abstract class Item {
	
	protected Attribute attribute; //attributo coinvolto nell'item
	protected Object value; //valore dell'attributo
	
	public Item(){};
	
	public Item(Attribute attribute, Object value){
	/**Input: riferimenti per attributo e suo valore
	Output:
	Comportamento: inizializza i valori dei membri attributi*/
		
		this.attribute = attribute;
		this.value = value;
	}
	
	Attribute getAttribute(){
	/**Input:
	Output: attributo coinvolto nell'item
	Comportamento: restituisce il membro Attribute;*/
	
		return this.attribute;
		
	}
	
	Object getValue(){
	/**Input:
	Output
	: valore dell'attributo coinvolto nell'item
	Comportamento: restituisce il membro Value;*/
		
		return this.value;
	
	}
	
	abstract boolean checkItemCondition(Object value); //metodo astratto implementato in
	/**Input:
	Output:
	Comportamento: verifica se esiste un item formato dalla coppia
	<Attributo (membro della classe) – Value (valore passato per
	argomento)*/
	
	
	public String toString(){
	/**Input:Output:
	Comportamento: restituisce una stringa composta dai contenuti degli
	oggetto membro*/
		String s = new String();
		s = s + attribute + " " + value;
		s = s + "\n";
		return s;
		
	}
}
