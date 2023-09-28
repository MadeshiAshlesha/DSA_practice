public class GridUniquePath {
     static int count(int m, int n){
        int[] prev=new int[n];
        for(int i=;i<m-1;i++){
            int[] temp=new int[n];
            for(int j=0; j<n;j++){
                temp[j]=prev[j]+temp[j-1];
            }
            prev=temp;
        }
        return prev;
     }
     public static void main(String[] args){
        int m=3;
        int n=2;
        System.out.println(count(m,n));
     }

}
