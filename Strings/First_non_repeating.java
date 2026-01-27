public class First_non_repeating {
    static void freq(String str){
        int []freq=new int [26];
        str=str.toLowerCase();

       for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println("-1");
    
    }
    public static void main(String[] args) {
        String str="popcorn";
        freq(str);
    }
}
