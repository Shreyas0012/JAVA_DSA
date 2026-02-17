// hashmapping question to find the longest substring without repeating characters in a given string.
import java.util.HashMap;

public class longrstsubstring_hash {

    static int norep(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        int maxlen = 0;
        int start = 0;

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                start = Math.max(start, map.get(ch) + 1);
            }

            map.put(ch, i);

            maxlen = Math.max(maxlen, i - start + 1);
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String str = "Popsicals";
        System.out.println(norep(str));
    }
}
