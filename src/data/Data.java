package data;

public class Data {
	
	private Object[][] data  ; /*una matrice nXm di tipo Object che contienel'insieme
	di transazioni ed � organizzato come numero di transazioni Xnumero di attributi*/
	private int numberOfExamples; // cardinalit� dell�insieme di transazioni
	private Attribute[] attributeSet; // oggetto per modellare un generico attributo
	
	Data(){
	/**Input:
	Output :
	Comportamento: Popola la matrice data [ ][ ] con le transazioni (per ora,
	14 transazioni e 5 attributi);*/
		
		
		numberOfExamples = 14;	
		data = new Object[numberOfExamples][5];
		
		/*data[0][0]=1;
		data[1][0]=2;
		data[2][0]=3;
		data[3][0]=4;
		data[4][0]=5;
		data[5][0]=6;
		data[6][0]=7;
		data[7][0]=8;
		data[8][0]=9;
		data[9][0]=10;
		data[10][0]=11;
		data[11][0]=12;
		data[12][0]=13;
		data[13][0]=14;*/
		
		data[0][0]="Sunny";
		data[1][0]="Sunny";
		data[2][0]="Overcast";
		data[3][0]="Rain";
		data[4][0]="Rain";
		data[5][0]="Rain";
		data[6][0]="Overcast";
		data[7][0]="Sunny";
		data[8][0]="Sunny";
		data[9][0]="Rain";
		data[10][0]="Sunny";
		data[11][0]="Overcast";
		data[12][0]="Overcast";
		data[13][0]="Rain";
		
		data[0][1]="Hot";
		data[1][1]="Hot";
		data[2][1]="Hot";
		data[3][1]="Mild";
		data[4][1]="Cool";
		data[5][1]="Cool";
		data[6][1]="Cool";
		data[7][1]="Mild";
		data[8][1]="Cool";
		data[9][1]="Mild";
		data[10][1]="Mild";
		data[11][1]="Mild";
		data[12][1]="Hot";
		data[13][1]="Mild";
	
		data[0][2]="High";
		data[1][2]="High";
		data[2][2]="High";
		data[3][2]="High";
		data[4][2]="Normal";
		data[5][2]="Normal";
		data[6][2]="Normal";
		data[7][2]="High";
		data[8][2]="Normal";
		data[9][2]="Normal";
		data[10][2]="Normal";
		data[11][2]="High";
		data[12][2]="Normal";
		data[13][2]="High";
		
		data[0][3]="Weak";
		data[1][3]="Strong";
		data[2][3]="Weak";
		data[3][3]="Weak";
		data[4][3]="Weak";
		data[5][3]="Strong";
		data[6][3]="Strong";
		data[7][3]="Weak";
		data[8][3]="Weak";
		data[9][3]="Weak";
		data[10][3]="Strong";
		data[11][3]="Strong";
		data[12][3]="Weak";
		data[13][3]="Strong";
		
		data[0][4]="No";
		data[1][4]="No";
		data[2][4]="Yes";
		data[3][4]="Yes";
		data[4][4]="Yes";
		data[5][4]="No";
		data[6][4]="Yes";
		data[7][4]="No";
		data[8][4]="Yes";
		data[9][4]="Yes";
		data[10][4]="Yes";
		data[11][4]="Yes";
		data[12][4]="Yes";
		data[13][4]="No";
		


		attributeSet = new DiscreteAttribute[5];
		/**istanzia 5 oggetti di tipo
		DiscreteAttribute per ciascun attributo assegnando, a ciascuno di
		essi, l'array dei valori discreti dell'attributo corrispondente.*/
		
		String OutlookV[]= {"Sunny","Rain","Overcast"};
		String TemperatureV[]= {"Hot","Cold","Mild"};
		String HumidityV[]={"High","Normal"};
		String WindV[]={"Weak","Strong"};
		String PlayTennisV[]={"Yes","No"};
			 
		attributeSet[0] = new DiscreteAttribute("Outlook",0,OutlookV);	
		attributeSet[1] = new DiscreteAttribute("Temperature",1,TemperatureV);  
		attributeSet[2] = new DiscreteAttribute("Humidity",2,HumidityV);
		attributeSet[3] = new DiscreteAttribute("Wind",3,WindV);
		attributeSet[4] = new DiscreteAttribute("PlayTennis",4,PlayTennisV);
	
	}
	
	public int getNumberOfExamples(){
	/**Input://
	Output: cardinalit� dell'insieme di transazioni
	Comportamento: restituisce il valore del membro numberOfExamples*/
		
		return this.numberOfExamples;
	
	}
	
	public int getNumberOfAttributes(){
	/**Input://
	Output: cardinalit� dell'insieme degli attributi
	Comportamento: restituisce la cardinalit� del membro attributeSet[ ]*/
	
		return this.attributeSet.length;
	}
	
	public Attribute getAttribute(int index ){
		
		return attributeSet[index];
	}
	
	Object getAttributeValue(int exampleIndex, int attributeIndex){
	/**Input: indice di riga per la matrice data [][] per una specifica transazione
	Output: Object associato all'attributo per la transazione indicizzata in input
	Comportamento: restituisce il valore dell' attributo attributeIndex per la
	transazione exampleIndex */
	
		
		return this.data[exampleIndex][attributeIndex];
		
	}
	
	public String toString() {
	/**Input: //
	Comportamento: legge i valori di tutti gli attributi per ogni esempio o
	transazione da data [ ][ ] e li concatena in un oggetto String che
	restituisce come risultato finale in forma di sequenze di testi.*/
		String s = new String();
		int i = 1;
		//for(int i = 0; i < this.getNumberOfExamples(); i++){
		for(Object[] o:data){	
			s = s + i + ":"; //print numbers
			
			//for(int j = 0; j < this.getNumberOfAttributes(); j++){
			for(Object u:o){	
				s = s + " " + (String) u;
			
			}
			
			s = s + "\n"; //newline after every transaction
		
		}
		
		return s;
	
	}
	
	public static void main (String args[]){
		
		Data prova = new Data();
		System.out.print(prova.toString());
		System.out.print(prova.getAttribute(1) + "\n");
		System.out.print(prova.getNumberOfExamples());
	}

}
