import java.util.Scanner;

public class MainProgram {
    MainProgram next;
    int kd,jumlah_stok,jumlah_rusak;
    String judul,dsb;
    public static Scanner Nazario = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
       
        int menu;
        
        DoubleLinkedList film = new DoubleLinkedList();
        
        do{
            System.out.println("--------------PERSEWAAN CD--------------");
            System.out.println("1.CD Masuk");
            System.out.println("2.CD Keluar");
            System.out.println("3.CD Rusak");
            System.out.println("4.Tampilkan Semua Data");
            System.out.println("5.Pencarian CD(Berdasarkan Kode & Judul CD)");
            System.out.println("6.Exit");
            System.out.print("Masukkan Pilihan Menu : ");
            menu = Nazario.nextInt();
            
            switch(menu){
                case 1:
                   MainProgram film2 = new MainProgram();
                   film2.input();
                   film.push(film2);
                    break;
                case 2:
                    film.pop();
                    break;
                case 3 :
                    System.out.println("Masukkan Index CD Rusak : ");
                    int rusak = Nazario.nextInt();
                    film.rusak(rusak);
                    break;
                case 4:
                    film.view();
                    break;
                case 5:
                    System.out.print("Masukkan Kode  : ");
                    System.out.println("Masukkan Judul : ");
                    String judul = Nazario.nextLine();
                    int code = Nazario.nextInt();
                    film.find2(code);
                    film.find1(judul);
                    break;
                case 6:
                    System.exit(0);
            }
        } while(menu == 1 || menu == 2 || menu == 3 || menu == 4 ||menu == 5||menu == 6);
    }
    
    void input(){
        System.out.print("Kode : ");
        kd = Nazario.nextInt();
        System.out.print("Judul : ");
        judul = Nazario.next();
        System.out.print("Distributor : ");
        dsb = Nazario.next();
        System.out.print("Jumlah Stok : ");
        jumlah_stok = Nazario.nextInt();
        System.out.print("Jumlah Rusak : ");
        jumlah_rusak = Nazario.nextInt();
        next = null;
    }
    
    void view() {
        System.out.println("Kode Film : " + kd);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Distributor : " + dsb);
        System.out.println("Jumlah Stok : " + jumlah_stok);
        System.out.println("Jumlah Rusak : " + jumlah_rusak);
    }
}
