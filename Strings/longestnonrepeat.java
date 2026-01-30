public class longestnonrepeat {

    static int longestnonrepeat(String s){
    int[]freq=new int[26];
        int maxlen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           freq[s.charAt(right)-'a']++;

           while(freq[s.charAt(right)-'a']>1){
            freq[s.charAt(left)-'a']--;
            left++;
           }
        
       
         maxlen=Math.max(maxlen,right-left+1);
        
    }
    return maxlen;
}
    public static void main(String[] args) {
        String s = "cabccbcbb";
        System.out.println(longestnonrepeat(s)); // 3
    }
}
