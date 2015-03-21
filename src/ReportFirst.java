import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class ReportFirst implements IReportFirst {
	
	@Override
	public void reportFirst(Line[] lineArray){
		
		 HashMap<String,Integer> map = new HashMap<String,Integer>();
		 ReportFirstValueComparator bvc =  new ReportFirstValueComparator(map);
		 TreeMap<String,Integer> tree_map = new TreeMap<String,Integer>(bvc);            
		 int i = lineArray.length; 
		 String names;
		 for(int p=0; p<i; p++){
		     names=lineArray[p].getHost().getHost();
		     int j=0;
		     if(map.containsKey(names)){                 
		         j= map.get(names);                      
		         map.put(names,j+1);
		         j=1;
		     }
		     else{
		         map.put(names,j);                   
		     }           
		 }
		 
         tree_map.putAll(map);
         int it=0;//счетчик вывода топ 10 повтор€ющихс€ имен
         System.out.println("----------------------------");
         for(Map.Entry e : tree_map.entrySet()){
             System.out.println(e.getKey()+" "+ e.getValue());
             it++;
             if(it==5) break; 
         }

		            
		
	}

}
