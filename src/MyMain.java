import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMain {

    public static void main(String[] args) {
        //Task1
        /*Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(Task1.mapAB(map));*/

        //Task2
        /*String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};
        System.out.println(Task2.worldMultiple(arr1));
        System.out.println(Task2.worldMultiple(arr2));
        System.out.println(Task2.worldMultiple(arr3));*/

        //Task3
        List<String> listName = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "navi");
        System.out.println(Task3_2.anagramWord(listName, "anna"));
        


        //Tasks4
        /*List<String> list = Arrays.asList("Ivan", "Nicolay", "Mic", "Bob", "Nicolay", "Bob", "Mic", "Bob", "Ivan", "Max");
        System.out.println(Task4.numberOfEntries(list, "Bob"));*/


    }


}
