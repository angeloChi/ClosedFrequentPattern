package data;

public class Attribute {

	protected String name; // nome simbolico dell'attributo
	protected int index; // identificativo numerico dell'attributo
	
	
	Attribute(){
		
	}
	
	Attribute(String name, int index){
	/**Input: valori per nome simbolico dell'attributo e identificativo numerico
	dell'attributo
	Output: //
	Comportamento: inizializza i valori dei membri name, index*/
	
	this.name = name;
	this.index = index;
		
	}
	
	String getName(){
	/**Input:
	Output : nome dell'attributo
	Comportamento: restituisce il valore nel membro name;*/
	
	return this.name;
	
	}
	
	int getIndex(){
	/**Input:
	Output : identificativo numerico dell'attributo
	Comportamento: restituisce il valore nel membro index;*/
	
	return this.index;
	
	}
	
	public String toString(){ //modificato per errore compilazione
	/**Input:
	Output : identificativo
	Comportamento: restituisce il valore nel membro name;*/
	//System.out.println(Attribute.toString(12));
		return this.name;
	
	
	}
}
