public class DoubleLinkedList {
    MainProgram top;
    private Node head;
    int size ;
    
    public DoubleLinkedList() {
        top = null;
    }
    
    public void pop(){
        if(top==null)
            System.out.println("Data Masih Kosong");
        else{
            System.out.println(" == ");
            top.view();
            top=top.next;
        }
    }
    
    public void push(MainProgram a){
        if(top==null)
            top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    
    public void view(){
    if(top==null) System.out.println("Data Kosong");
    else{
        MainProgram ptr=top;
        while(ptr!=null){
            System.out.println(" == ");
            ptr.view();
            ptr=ptr.next;
            
        }
        }
    }
    
    public void find1(String judul){
        Node head = null;
        Node current = head;
        String jdl = "Tidak Ditemukan";
        int n=0;
        if(current == null){
            System.out.println("Data Kosong");
        }else{
            while(current != null){
                if(current.judul == null ? judul == null : current.judul.equals(judul)){
                    jdl = current.judul;
                    n = current.kode;
                    break;
                }
                current = current.next;
            }
            System.out.println("Kode : " + n);
            System.out.println("Judul : "+ jdl);
            System.out.println(" ");
        }
    }
    public Boolean isEmpty() {
        return head == null;
    }
    
    public void find2(int kd) {
        if (isEmpty()) {
            System.out.println("LinkedList Kosong");
        }
        Node tmp = head;
        int i = 0;
        while (tmp.next != null) {
            if (tmp.kode == kd) {
                break;
            } else {
                tmp = tmp.next;
                i++;
            }
        }
        if (tmp.next != null) {
            System.out.println("CD " + kd + " ditemukan pada indeks ke- " + (i + 1));
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
    public void rusak (int index){
        if (isEmpty()) {
            System.out.println("CD Rusak = Kosong");
        }
        Node tmp = head;
        int i = 0;
        while (tmp.next != null) {
            if (tmp.jumlah_rusak == index) {
                break;
            } else {
                tmp = tmp.next;
                i++;
            }
        }
        if (tmp.next != null) {
            System.out.println("Jumlah : " + tmp.jumlah_rusak);
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}