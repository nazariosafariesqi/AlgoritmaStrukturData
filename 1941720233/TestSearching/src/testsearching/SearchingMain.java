package testsearching;

import java.util.Scanner;

public class SearchingMain {
    public static void main(String[]args){
        int data[] = new int [8]  ;
        Scanner Nazario = new Scanner(System.in);
       
        for(int i=0; i<data.length; i++){
            System.out.println("Array ke- "+i+": ");
            data[i]=Nazario.nextInt();
        }    
        Searching pencarian = new Searching(data,8);
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        
        System.out.println("Nilai yang Ingin Dicari :");
        int cari = Nazario.nextInt() ;
        
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FinSeqSearch(cari);
        
        pencarian.Tampilposisi(cari,posisi);
        System.out.println("====================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari,0,data.length-1);
        pencarian.Tampilposisi(cari,posisi);
        
    }
}