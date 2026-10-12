public class threesm {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int target =14;
        int n=arr.length;
        for(int i=0; i<n;i++){
            for (int j=i+1; j<n; j++){
                for (int k =j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                           System.out.println(i+"," +j+","+k);

                    }
                }
            }
        
    }
}
}
