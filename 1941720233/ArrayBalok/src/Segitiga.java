public class Segitiga {
    public int alas ;
    public int tinggi ;
    
    public Segitiga(int a,int t){
        alas = a;
        tinggi = t ;
    }
    Segitiga() {
    }
    void hitungLuas(int a,int t){
       int luas = 1/2*a*t;
 
    }
    void hitungKeliling(int a,int t){
        int keliling = a+t;
        
    }

    String hitungLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String hitungKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
