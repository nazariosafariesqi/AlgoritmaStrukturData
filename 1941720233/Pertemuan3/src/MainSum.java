import java.util.Scanner;
public class MainSum {
    public static void main(String[]args){
        Scanner Nazario = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Program Menghitung Keuntungan Total(satuan juta. Misal 5,9)");
        System.out.println("Masukkan jumlah bulan : ");
        int elm = Nazario.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("-------------------------------------------");
        for(int i = 0; i < sm.elemen ; i++){
            System.out.println("Masukkan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i] = Nazario.nextDouble();
        }
        System.out.println("-------------------------------------------");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("-------------------------------------------");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
}
