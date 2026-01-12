// returns the value where both sides sum are equal
public class equilibrium{
    static int equi(int[]arr){
        int equi=-1;
        int leftsum=0;
        int total=0;
        int point=0;
        int rightsum=0;
        for (int t=0;t<arr.length;t++){
           total=total+arr[t];
        }
        System.out.println(total);
        for(int i=0;i<arr.length;i++){
            
            rightsum=total-leftsum-arr[i];
            
            if(leftsum==rightsum){
                 point=arr[i];
                equi=i;
                break;
            }
            leftsum=leftsum+arr[i];
        }
        System.out.println("equi is : "+point+"rightsum= "+rightsum);
        return equi;

    }
    public static void main(String[] args) {
        int[]arr={1,3,2,5,2,2,2};
        System.out.println(equi(arr));
    }
}