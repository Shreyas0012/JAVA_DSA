public class compress {
    static void compress(String str){
       String res="";
       int count=1;
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
            count++;
        }
        else{
            res+=str.charAt(i-1);
            res+=count;
            count=1;
        }
        if(i==str.length()-1){
            res+=str.charAt(i);
            res+=count;
        }
       }
       System.out.println(res);
    }
    public static void main(String[] args) {
        String str="aaabbccdee";
        compress(str);
    }
}
