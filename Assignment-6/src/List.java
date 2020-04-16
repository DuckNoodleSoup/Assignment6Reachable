public class List {
    //Implementing Hash Table
    int length;
    ListNode[] table = new ListNode[17]; //m is prime number

    public List(int l){
        length = l;
        //table = new ListNode[length];
    }

    public void add(int x){
        a = new ListNode(x);
        int h = hash(a);
        ListNode current = table[h];
        if(current == null) {
            table[h] = a;
        }else{
            while(current.next != null){
                current = current.next;
            }
            current.next = a;
        }
    }

    public int hash(ListNode h){
         int k = h.storage;
         int hash = k%17;
         return hash;
    }
}
