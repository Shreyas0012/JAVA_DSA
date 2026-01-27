public class Anagram{
     
static boolean Annagram(String str,String str2){
    int[] freq=new int [26];
    str=str.toLowerCase();
    str2=str2.toLowerCase();

    if (str.length()!=str2.length()){
        return false;
    }
    for(int i=0;i<str.length();i++){
        freq[str.charAt(i)-'a']++;
    }
   for(int i=0;i<str2.length();i++){
        freq[str2.charAt(i)-'a']--;
    }
     for(int i=0;i<26;i++){
        if(freq[i]!=0){
        return false;
        }
        
    }
    return true;
} 
    public static void main(String[] args) {
        String str="silent";
        String str2="listen";
       System.out.println( Annagram(str, str2));
    }
}