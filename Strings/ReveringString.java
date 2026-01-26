public class ReveringString {
     String Reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
     }
    public static void main(String[] args) {
        String str="Shreyas";
        ReveringString myobj=new ReveringString();
        System.out.println(myobj.Reverse(str));
    }
}