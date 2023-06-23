import java.util.HashMap;
import java.util.TreeMap;


public class Helper {

    /*
     * Method that initializes creating a new HashMap
     */
    public static HashMap createMap(){
        HashMap<Integer, Integer> initialMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            initialMap.put(i, i*2);
        }
        return initialMap;
    }

    /*
     * Method that returns inverted HashMap
     */
    public static HashMap<Integer, Integer> inverse(HashMap initialMap){
        HashMap<Integer, Integer> resultMap  = new HashMap<>();
        initialMap.forEach((key, value) -> resultMap.put((Integer) value, (Integer) key));
        return resultMap;
    }

    /*
     * Method that returns inverted HashMap sorted by 'Key'
     */
    public static TreeMap<Integer, Integer> inverseMap(HashMap initialMap){
        HashMap<Integer, Integer> resultMap  = new HashMap<>();
        initialMap.forEach((key, value) -> resultMap.put((Integer) value, (Integer) key));
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(resultMap);
        sortedMap.putAll(resultMap);
        return sortedMap;
    }
}
