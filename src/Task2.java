import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static Map<String, Boolean> worldMultiple (String[] myarr){
        Map<String, Boolean> wM = new HashMap<>();
        for (int i = 0; i < myarr.length; i++) {
            if(wM.containsKey(myarr[i]))
            wM.put(myarr[i], true);
            else wM.put(myarr[i], false);
        }
        return wM;
    }
}
