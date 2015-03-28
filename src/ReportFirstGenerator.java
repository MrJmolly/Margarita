import java.util.HashMap;
import java.util.TreeMap;


public class ReportFirstGenerator implements IReportFirstGenerator {
	
	@Override
	public ReportFirst reportFirstGenerator(Line[] lineArray){
		ReportFirst repFirst = new ReportFirst();
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
		repFirst.setTree_map(tree_map);
        return repFirst;
	}

}
