public class isRotation {
    static boolean isrotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3=s1+s1;
        if(s3.contains(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        System.out.println(isrotation(s1, s2));
    }
    
}
