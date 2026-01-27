public class frequency {
     int[] freq(String s){
        int[] freq=new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a') +"->"+freq[i]);
            }
        }
return freq;
    }
    public static void main(String[] args) {
        String s="helloWorld";
        frequency obj=new frequency();
        obj.freq(s);
    }
}