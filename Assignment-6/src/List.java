//List for Graph's Bucket Hashing, implements Hash table for storage
public class List {
    //Implementing Hash Table
    int length;
    ListNode[] table = new ListNode[17]; //m is prime number

    public List(int l){
        length = l;
        //table = new ListNode[length];
    }

    public void add(int x){
        ListNode a = new ListNode(x);
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

    public void print(){
        System.out.print("Current List: ");
        //Loop through all 17 Hash table items
        for(int b=0;b<17;b=b+1){
            //If item is there, go through chained bucket
            if(table[b]!=null){
                ListNode current = table[b];
                System.out.print(current.storage+" ");
                while(current.next!=null){
                    System.out.print(" "+current.storage+" ");
                    current = current.next;
                }
            }
        }
        System.out.println();
    }
}
