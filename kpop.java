public class kpop{
   static void longestnonrepeat(String str){
       int count=1;
       String res="";
      for(int i=1;i<str.length();i++){
         char ch=str.charAt(i);
         if(ch==str.charAt(i-1)){
           count++;
         }
         else{
           res+=str.charAt(i-1);
           res+=count;
           count=1;
         }
         if(i==str.length()-1){
            res+=ch;
            res+=count;
         }
      }
      System.out.println(res);
   }
          public static void main(String[] args) {
      String str="AAA";
      longestnonrepeat(str);      }
}
   



