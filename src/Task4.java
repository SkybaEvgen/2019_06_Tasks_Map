import java.util.List;
import java.util.Map;

public class Task4 {
    public static int numberOfEntries (List<String> list, String name){
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(name)) count++;
        }
        return count;
    }
}
