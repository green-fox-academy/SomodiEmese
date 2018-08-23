import java.util.HashMap;

public class CountLetters {

    public HashMap<String, Integer> countLetters(String example) {
        HashMap<String, Integer> counter = new HashMap();
        for(char c : example.toCharArray()){
            String string = c+"";
            if(!counter.containsKey(string)){
                counter.put(string, 1);
            }else{
                counter.put(string, counter.get(string)+1);
            }
        }return counter;
    }
}