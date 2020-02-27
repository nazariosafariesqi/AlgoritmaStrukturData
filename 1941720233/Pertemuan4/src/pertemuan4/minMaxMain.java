package pertemuan4;
import java.util.Scanner;
import static pertemuan4.minMax.max_min;
public class minMaxMain {
    public static void main(String[]args){
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        
        Scanner Nazario = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            ppArray[i] = new minMax();
            System.out.println("Nilai Array Indeks Ke-"+i);
            System.out.print("Masukkan Nilai : ");
            ppArray[i].nilaiArray = Nazario.nextInt();
        }
        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;
        for(int i=0;i<5;i++){
            if(ppArray[i].nilaiArray<min)
                min = ppArray[i].nilaiArray;
            else if(ppArray[i].nilaiArray>max)
                max = ppArray[i].nilaiArray;
        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : "+min);
        System.out.println("Nilai Maksimal : "+max);
        
        int arr[] = new int[5];
        for(int i=0; i<5 ;i++){
            arr[i] = ppArray[1].nilaiArray;
        }
            Maxmin hasil = new Maxmin();
            max_min(arr, 0, 4, hasil);
            
            System.out.println("Divide Conquer");
            System.out.println("Nilai Minimal : "+hasil.minimum+"\nNilai Maksimal : "+hasil.maximum);
            System.out.println("\n");
    }
}
