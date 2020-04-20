import org.omg.CosNaming._BindingIteratorImplBase;

//Stack for Reachable: made for Depth First Search
public class Stack {
    public StackNode top;
    public StackNode last;

    public Stack(){
        top = null;
        last = null;
    }

    public void push(int x){
        //1. If first is null, just add
        if (top==null){
            top = new StackNode(x);
            last = top;

            //TEST
            System.out.println("Top is: "+top.storage);
            //TeST

            return;
        }

        //2. Else, add it to linked list
        StackNode push = new StackNode(x);
        StackNode current = top;
        while(current.next != null){
            current = current.next;
        }
        current.next = push;
        push.previous = current;
        last = push;

        //TEST
        System.out.println("Pushed "+last.storage);
        //TEST
    }

    public int pop(){
        //Case 1: nothing is in the stack
        if(top==null) {
            System.out.println("Stack has no items");
            return -1;
        //Case 2: top is the only one
        }else if (top.next == null){
            int t = top.storage;
            top = null;
            return t;
        //All else: take last storage, make previous last
        }else{
            int t = last.storage;
            StackNode prev = last.previous;
            prev.next = null;
            last = prev;
            return t;
        }
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
}