package pertemuan4;

public class ContohBigO {
    public static void contohBigO(int[]angka){
        System.out.println("Pairs : ");
        int n = angka.length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(angka[i]+"-"+angka[j]);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("Hai");
            }
        }
    }
}
