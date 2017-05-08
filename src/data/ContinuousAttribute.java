package data;

 class ContinuousAttribute extends Attribute {
	
	private float max;
	private float min;// rappresentano gli estremi di un intervallo

	public ContinuousAttribute(String name, int index, float min, float max){
	/**Input: estremi per intervallo, identificativo numerico dell'attributo e nome
	dell�attributo
	Output : //
	Comportamento: Invoca il costruttore della classe madre e avvalora i
	membri*/
	
		super(name,index); //Richiamo il costruttore della superclasse
		this.min=min;
		this.max=max;
	}
	
	float getMin(){
	/**Input: //
	Output : estremo inferiore dell'intervallo
	Comportamento: Restituisce il valore del membro min*/
		return this.min;

	}
	float getMax(){
	/**Input: //
	Output : estremo superiore dell'intervallo
	Comportamento: Restituisce il valore del membro max
	*/
		return this.max;
	}
}
