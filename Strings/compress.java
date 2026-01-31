public class compress{
    static void compress(String str){
    StringBuilder res =new StringBuilder();
    int count=1;
    for (int i=1;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
            count++;
        }
        else{
            res.append(str.charAt(i-1));
            res.append(count);
            count=1;  
        }
        if(i==str.length()-1){
            res.append(str.charAt(i));
            res.append(count);
        }
    }System.out.println(res);
    }
    public static void main(String[] args) {
        String str="aaasssttyou";
        compress(str);
    }
}