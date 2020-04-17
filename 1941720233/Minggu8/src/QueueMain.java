import java.util.Scanner;

public class QueueMain {
    public static void main(String[]args){
        
        Scanner Nazario = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Maksimal Antrian : ");
        int n = Nazario.nextInt();
        
        Queue Q = new Queue(n);
        int pilih ;
        
        do{
            menu();
            pilih = Nazario.nextInt();
            switch(pilih){
                case 1 :
                    System.out.println("Masukkan Data Baru : ");
                    int dataMasuk = Nazario.nextInt();
                    Q.Enqueue(dataMasuk);
                    break ;
                case 2 :
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : "+dataKeluar);
                        break ;
                    }
                case 3 :
                    Q.print();
                    break ;
                case 4 :
                    Q.peek();
                    break ;
                case 5 :
                    Q.peekRear();
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }

    private static void menu() {
        System.out.println("Masukkan Operasi Yang Diinginkan : ");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Print");
        System.out.println("4.Peek");
        System.out.println("5.Peek Rear");
        System.out.println("------------------------------------");
    }
}