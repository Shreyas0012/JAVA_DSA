public class removeduplicates {
    static void removeduplicates(String str){
        String res="";
        int[]freq=new int[256];
        str=str.toLowerCase();
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
            if(freq[ch-'a']==1){
                res+=ch;
            }
            }
        System.out.println(res);

    }
    public static void main(String[] args) {
        String str="programming";
        removeduplicates(str);
    }
    
}
