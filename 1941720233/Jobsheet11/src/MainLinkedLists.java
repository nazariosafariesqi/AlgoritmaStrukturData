import java.util.Scanner;

public class MainLinkedLists {
    public static void main(String[]args){
        LinkedLists data = new LinkedLists();
        Scanner Nazario = new Scanner(System.in);
        
        int pilih ;
        
        System.out.println("1.Tambah");
        System.out.println("2.Hapus");
        System.out.println("3.Cari");
        System.out.println("4.Keluar");
        System.out.println("Pilih Menu :");
        pilih = Nazario.nextInt();
        try {
            switch(pilih){
                case 1 :
                    System.out.println("------------------");
                    System.out.println("a.Tambah");
                    System.out.println("b.Tambah(index)");
                    System.out.println("c.Tambah(last)");
                    System.out.println("Pilih :");
                    
                    String z = Nazario.next();
                    
                    if(z.equalsIgnoreCase("a")){
                        System.out.println("Masukkan Angka Node Awal : ");
                        int awal = Nazario.nextInt();
                        data.addFirst(awal);
                    }else if(z.equalsIgnoreCase("b")){
                        System.out.println("Masukkan Angka Node : ");
                        int tambah = Nazario.nextInt();
                        System.out.println("Masukkan Index : ");
                        int index = Nazario.nextInt();
                        data.add(tambah,index);
                    }else if(z.equalsIgnoreCase("c")){
                        System.out.println("Masukkan Angka Node Akhir : ");
                        int akhir = Nazario.nextInt();
                        data.addLast(akhir);
                    }else{
                        System.out.println("Input Yang Anda Masukkan Salah ! ");
                    }break ;
                case 2 :
                    System.out.println("------------------");
                    System.out.println("a.Hapus(index)");
                    System.out.println("b.Hapus(key)");
                    System.out.println("c.Clear");
                    System.out.println("Pilih : ");
                    
                    String x = Nazario.next();
                    
                    if(x.equalsIgnoreCase("a")){
                        System.out.println("Masukkan Nilai Index Yang Dihapus : ");
                        int hapus = Nazario.nextInt();
                        data.remove(hapus);
                    }else if(x.equalsIgnoreCase("b")){
                        System.out.println("Masukkan Nilai Yang Dihapus : ");
                        int hapusn = Nazario.nextInt();
                        data.removeByValue(hapusn);
                    }else if(x.equalsIgnoreCase("c")){
                        System.out.println("Data Sudah Dikosongkan : ");
                        data.clear();
                    }else{
                        System.out.println("Input Yang Anda Masukkan Salah ! ");
                    }break ;
                case 3 :
                    System.out.println("------------------");
                    System.out.println("a.Cari(index)");
                    System.out.println("b.Cari(key)");
                    System.out.println("Pilih : ");
                    
                    String y = Nazario.next();
                    
                    if(y.equalsIgnoreCase("a")){
                        System.out.println("Masukkan Nilai Index Yang Dicari : ");
                        int cari = Nazario.nextInt();
                        data.indexOf(cari);
                    }else if(y.equalsIgnoreCase("b")){
                        System.out.println("Masukkan Nilai Yang Dicari : ");
                        int cari2 = Nazario.nextInt();
                        data.indexOf(cari2);
                    }else{
                        System.out.println("Input Yang Anda Masukkan Salah ! ");
                    }break ;
                case 4 :
                    System.exit(0);
                    break;
                }
            }catch(Exception e){
            //
        }
    }
}