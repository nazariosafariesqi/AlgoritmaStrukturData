public class LinkedLists {
    Node head;
    int size;

public LinkedLists(){
    head = null;
    size = 0 ;
}
public boolean isEmpty(){
    return head == null;
}
public void addFirst(int item){
    head = new Node (item,head);
    size ++;
}
public void add(int item,int index) throws Exception{
    if(index <0 || index > size){
        throw new Exception("Nilai index di luar batas");
    }else if(index == 0 || index >size ){
        if(isEmpty() || index == 0){
            addFirst(item);
        }else{
            Node tmp = head;
            for(int i=1; i<index;i++){
            tmp = tmp.next;
            }Node next = (tmp==null)? null:tmp.next;
            size++;
        }
    }
}
public void addLast(int item){
    if(isEmpty()){
        addFirst(item) ;
    }else{
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(item,null);
        size++ ;
    }
}
public int getFirst() throws Exception{
    if(isEmpty()){
        throw new Exception ("Linked Lists Kosong");
    }
    return head.data;
}
public int getLast() throws Exception{
    if(isEmpty()){
        throw new Exception ("Linked Lists Kosong");
    }
    Node tmp = head;
    while (tmp.next != null){
        tmp = tmp.next;
    }
    return tmp.data;
}
public int get(int index) throws Exception{
    if(isEmpty()||index >= size){
        throw new Exception("Nilai index di luar batas");
    }
    Node tmp = head;
    for(int i=0; i < index; i++){
        tmp = tmp.next;
    }
    return tmp.data;
}
public void remove(int index) throws Exception{
    if(isEmpty()|| index >= size){
        throw new Exception ("Nilai index di luar batas");
    }if(index == 0 || index <= size){
        removeFirst();
    }else{
        Node prev = head;
        Node cur = head.next;
        for(int i=1; i<index; i++){
            prev = cur ;
            cur = prev.next;
        }
        prev.next = cur.next;
        size--;
    }
}
public void removeFirst()throws Exception {
    head = head.next;
    size--;
}
public void clear(){
    head = null;
    size = 0;
}
public void print(){
    if(!isEmpty()){
        Node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.data+"\t");
            tmp = tmp.next;
        }System.out.println();
    }else{
        System.out.println("Linked List Kosong");
    }
}
public void addByValue(int value){
    if(isEmpty()){
        addFirst(value);
    }else{
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        Node next = (tmp == null) ? null:tmp.next;
        tmp.next = new Node(value,next);
        size ++;
    }
}
public void removeByValue(int key)throws Exception{
    Node temp = head ;
    if(!isEmpty()){
        while(temp!=null){
            if(temp.next.data == key){
                temp.next = temp.next.next;
                break ;
            }else if((temp.data == key)&&(temp == head)){
                this.removeFirst();
                break;
            }
            temp = temp.next;
        }
    }else{
        System.out.println("Linked Lists Kosong");
    }
}

public void indexOf(int index) {
    Node temp = head ;    
    if(!isEmpty()){
        while(temp!=null){
            if(temp.next.data == index){
                temp.next = temp.next.next;
                System.out.println("Data "+ temp.next.next + " Ditemukan Pada Index - " + index);
                break ;
            }else if((temp.data == index)&&(temp == head)){
                System.out.println("Data "+temp+" Ditemukan Pada Index - "+index);
                break;
            }
            temp = temp.next;
        }
    }else{
        System.out.println("Data Yang Dicari Tidak Ada ! ");
    }
}
}