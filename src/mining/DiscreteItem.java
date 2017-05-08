package mining;

import data.DiscreteAttribute;

public class DiscreteItem extends Item {
	
	DiscreteItem(DiscreteAttribute attribute, String value){
		super(attribute, value);
		this.attribute = attribute;
		this.value = value;
	}
	
	boolean checkItemCondition(Object value){
		//verifica che l'item corrente ha valore uguale a Value
		//per la coppia <Attributo discreto- Value discreto >
		if (this.value == value)
			return true;
		else 
			return false;
	}
}
