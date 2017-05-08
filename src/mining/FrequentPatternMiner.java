package mining;
import utility.*;
import data.*;

import data.Attribute;
import data.Data;
import data.DiscreteAttribute;
import utility.LinkList;
import utility.Queue;

public class FrequentPatternMiner {
	
	static LinkList frequentPatternDiscovery(Data data,float minSup){
		Queue fpQueue=new Queue();		
		LinkList outputFP=new LinkList();
		for(int i=0;i<data.getNumberOfAttributes();i++)
		{
			Attribute currentAttribute=data.getAttribute(i); // genera item discreto k=1 con valori attributo discreto-valore discreto possibile di attributo
			for(int j=0;j<((DiscreteAttribute)currentAttribute).getNumberOfDistinctValues();j++){
				DiscreteItem item=new DiscreteItem( 
						(DiscreteAttribute)currentAttribute, 
						((DiscreteAttribute)currentAttribute).getValue(j));
				FrequentPattern fp=new FrequentPattern(); //genera pattern con questo item e calcola il supporto
				fp.addItem(item);
				fp.setSupport(FrequentPatternMiner.computeSupport(data, fp));
				// da completare
				
			}
			
		}
		outputFP=expandFrequentPatterns(data,minSup,fpQueue,outputFP);
		return outputFP;
	}
	
	private static   LinkList expandFrequentPatterns(Data data, float minSup, 	Queue fpQueue,LinkList outputFP){
		while (!fpQueue.isEmpty()){
			FrequentPattern fp=(FrequentPattern)fpQueue.first(); //fp to be refined
			fpQueue.dequeue();
			for(int i=0;i<data.getNumberOfAttributes();i++){
				boolean found=false;
				for(int j=0;j<fp.getPatternLength();j++) //the new item should involve an attribute different form attributes already involved into the items of fp
					if(fp.getItem(j).getAttribute().equals(data.getAttribute(i))){
						found=true;
						break;
					}
				if(!found) //data.getAttribute(i) is not involve into an item of fp
				{
					for(int j=0;j<((DiscreteAttribute)data.getAttribute(i)).getNumberOfDistinctValues();j++){
						DiscreteItem item=new DiscreteItem(
								(DiscreteAttribute)data.getAttribute(i),
								((DiscreteAttribute)(data.getAttribute(i))).getValue(j)
								);
						FrequentPattern newFP=FrequentPatternMiner.refineFrequentPattern(fp,item); //generate refinement
						newFP.setSupport(FrequentPatternMiner.computeSupport(data,newFP));
						// da completare
					}
				}
		}
	}
		return outputFP;
	}
	
	// Aggiorna il supporto
	
	static float computeSupport(Data data,FrequentPattern FP){
		DiscreteItem app = new DiscreteItem(null,null);
		Attribute attr = new Attribute();
		Object val = new Object();
		for(int i=0;i<FP.getPatternLength();i++){
				app = (DiscreteItem)FP.getItem(i);
				attr = app.getAttribute();
				val = app.getValue();
				for(int j=0;j<data.getNumberOfExamples();j++){
					if(data.getAttributeValue(j,))
				}
		}
		
	}
	
	static FrequentPattern refineFrequentPattern(FrequentPattern FP, Item item){
	// da completare	
	}

}
	


