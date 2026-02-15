import java.util.HashMap;

public class longrstsubstring_hash {
    static void norep(String str){
        int maxlen=0;
        int start=0;
        int end=0;
    HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<str.length();i++){
        if(!map.containsKey(str.charAt(i))){
           map.put(str.charAt(i),i);
           end=i;
           maxlen=Math.max(maxlen,end-start);
        }
        else{
            maxlen=Math.max(maxlen,i-start);
            start=Math.max(start,map.get(str.charAt(i))+1);
           
            }
        }
        System.out.println(maxlen);
       }
    
    public static void main(String[] args) {
        String str="pineapple";
        norep(str);
    }
}
