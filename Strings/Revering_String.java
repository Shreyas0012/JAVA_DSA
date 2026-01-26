public class Revering_String {
     String Reverse(String str){
        int n=str.length();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
     }
    public static void main(String[] args) {
        String str="Shreyas";
        Revering_String myobj=new Revering_String();
        System.out.println(myobj.Reverse(str));
    }
}