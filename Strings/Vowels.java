import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=(sc.nextLine()).toLowerCase();
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                System.out.print(name.charAt(i)+" \n");
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: "+count);

    }
}
