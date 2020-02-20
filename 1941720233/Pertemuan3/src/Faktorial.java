public class Faktorial {
    public int nilai ;
    
    public int faktorialBF(int n){
        int i = 1 ;
        int fakto = 1;
        while(i <= n ){
            fakto = fakto * i;
            i++ ;
        }
        return fakto ;
    }
    public int faktorialDC(int n){
        if(n==1){
            return 1;
    }
        else{
            int fakto = n * faktorialDC(n-1);
            return fakto ;
        }
    }
}
