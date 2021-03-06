import java.util.HashMap;
import java.util.TreeMap;


public class ReportFirstGenerator implements IReportGenerator<ReportParameters, ReportFirst> {
	
	@Override
	public ReportFirst reportGenerator(ReportParameters reportParameters){
		ReportFirst repFirst = new ReportFirst();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		ReportFirstValueComparator bvc =  new ReportFirstValueComparator(map);
		TreeMap<String,Integer> tree_map = new TreeMap<String,Integer>(bvc);            
		int i = reportParameters.getLine().length; 
		String names;
		for(int p=0; p<i; p++){
			if (reportParameters.getLine()[i].getDate().getTime()>reportParameters.getDateFrom().getTime() && reportParameters.getLine()[i].getDate().getTime()<reportParameters.getDateTo().getTime())
			{
		    names=reportParameters.getLine()[p].getHost().getHost();
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
		}
		tree_map.putAll(map);
		repFirst.setTree_map(tree_map);
        return repFirst;
	}
}