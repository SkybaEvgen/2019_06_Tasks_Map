import java.util.*;

public class Task3_2 {
    public static List<String> anagramWord (List<String> list, String word){
        Map<String, List<String >> voc = new HashMap<>();
        List<String> listWord = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(sortWord(word).equals(sortWord(list.get(i))))
                listWord.add(list.get(i));
        }
        return listWord;
    }

    public static String sortWord (String s){
        char[] str = s.toCharArray();
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder(str.length);
        for (Character c : str) sb.append(c.charValue());
        String q = sb.toString();
        return q;
    }
}

