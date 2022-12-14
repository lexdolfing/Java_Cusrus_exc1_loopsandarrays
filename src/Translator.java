import java.util.HashMap;
import java.util.Map;

public class Translator {
    HashMap<Integer,String> numericAlpha = new HashMap<>();


    // constructor
    public Translator(String[] alphabetic, Integer[] numeric){
        for(int i= 0; i < alphabetic.length; i++){
            numericAlpha.put(numeric[i],alphabetic[i]);
        }
    }
    public String translate(Integer number){
        return numericAlpha.get(number);
    }

}
