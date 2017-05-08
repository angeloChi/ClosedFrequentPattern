package mining;
import java.util.Vector;

class FrequentPattern {
	
	Vector <Item> fp; //array che contiene gli oggetti Item che definiscono il pattern
					//private Item fp[ ];
	
	private float support; //valore di supporto (frequenza relativa)
	
	FrequentPattern(){
		this.fp = new Vector<Item>(0); //fp.size vale 0
		System.out.println(fp.size());
	}
	
	void addItem(Item item){
		fp.addElement(item); //metodo per aggiungere in coda
		System.out.println(fp.size()); //fp.size si incrementa autonomamente
	}
	
	Item getItem(int index){
		return this.fp.elementAt(index);
	}
	
	float getSupport(){
		return this.support;
	}
	
	int getPatternLength(){
		return this.fp.size();
	}
	
	void setSupport(float support){
		this.support = support;
	}
	
	public String toString(){
		String value="";
		for(int index=0; index<fp.size()-1; index++)
			value+= fp.elementAt(index) +" AND ";
		if(fp.size()>0){
			value+= fp.elementAt(fp.size()-1);
			value+="["+support+"]";
		}
		return value;
	}

}