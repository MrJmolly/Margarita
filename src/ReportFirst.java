import java.util.Map;
import java.util.TreeMap;


public class ReportFirst {
	
private TreeMap<String,Integer> tree_map;
	
	public void treeMapToString(){
		int it=0;//счетчик вывода топ 5 повтор€ющихс€ имен
        System.out.println("----------------------------");
        for(Map.Entry e : tree_map.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
            it++;
            if(it==5) break; 
        }
	}

	public TreeMap<String,Integer> getTree_map() {
		return tree_map;
	}

	public void setTree_map(TreeMap<String,Integer> tree_map) {
		this.tree_map = tree_map;
	}

}
