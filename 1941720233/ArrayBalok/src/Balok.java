public class Balok {
    public int panjang ;
    public int lebar ;
    public int tinggi ;
    
    public Balok(int p,int l,int t){
        panjang = p ;
        lebar = l ;
        tinggi = t ;
    }

    Balok() {
    }
    public int hitungVolume(){
    return panjang*lebar*tinggi;
    }
}
