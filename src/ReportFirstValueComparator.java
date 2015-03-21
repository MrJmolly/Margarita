import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class ReportFirstValueComparator implements Comparator<String> {

	 
    Map<String, Integer> base;
    public ReportFirstValueComparator(HashMap<String, Integer> map) {
        this.base = map;
    }
 
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } 
    }
 

}
