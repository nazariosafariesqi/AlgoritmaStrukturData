public class Node {
    int kode,jumlah_stok,jumlah_rusak;
    String judul,dsb;
    Node next,prev,head;
    
	Node(Node prev,int kode, String judul,int jumlah_stok,int jumlah_rusak ,Node next) {
        this.kode = kode;
        this.judul = judul;
        this.jumlah_stok = jumlah_stok;
        this.jumlah_rusak = jumlah_rusak;
        this.next = next;
        this.prev = prev;
        this.prev = head;
    }
}
