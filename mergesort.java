public class mergesort{
    static void merge(int[]arr,int left,int mid,int right){
       int n1=mid-left+1;
       int n2=right-mid;

       int[]L=new int[n1];
       int[]R=new int[n2];

       for(int i=0;i<n1;i++){
        L[i]=arr[left+i];
       }
       for(int j=0;j<n2;j++){
        R[j]=arr[mid+j+1];
       }

       int i=0,j=0,k=left;
       while(n1>i && n2>j){
        if(L[i]<=R[j]){
            arr[k]=L[i];
            i++;
        }
        else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
        while(n1>i){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(n2>j){
            arr[k]=R[j];
            j++;
            k++;
        }
       }
    
    static void mergesort(int[]arr,int left,int right){
       if(left<right){
        int mid=left+(right-left)/2;

        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);

        merge(arr,left,mid,right);
    }
    }

        
    public static void main(String[] args) {
        int[]arr={1,4,2,6,7};
        mergesort(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    
    }
}