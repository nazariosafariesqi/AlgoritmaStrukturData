package minggu2;

public class Barang {
    String namaBarang, jenisBarang,asalBarang;
        int stok, hargaSatuan;
        Barang(){
        }
        Barang(String nm, String jn, int st, int hs){
            namaBarang = nm;
            jenisBarang = jn;
            stok = st;
            hargaSatuan = hs;
        }

    Barang(String asal) {
        asalBarang = asal ;
    }
      
        void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Stok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
        void tampilBarang2(){
            System.out.println("Asal Barang = "+asalBarang);;
        }
        void tambahStok(int n){
        stok = stok +n;
    }
        void kurangiStok(int n){
        if(stok>0){
            stok = stok-n;
        }
    }
        int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}
