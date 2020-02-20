import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[]args){
        long start = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        Scanner Nazario = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = Nazario.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for(int i = 0 ; i< elemen ; i++){
            fk[i] = new Faktorial();
            System.out.println("Masukkan Nilai Data Ke-"+(i+1)+" : ");
            fk[i].nilai = Nazario.nextInt();
        }
        System.out.println("-------------------------------------");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        long end =System.currentTimeMillis();
            System.out.println("Proses Waktu : "+((end - start)/1000)+" second");
        System.out.println("--------------------------------------");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));   
        }
        long end2 =System.currentTimeMillis();
            System.out.println("Proses Waktu : "+((end2 - start2)/1000)+" second");
        System.out.println("______________________________________");
    }
}
