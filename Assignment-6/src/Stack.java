public class Stack {
    public StackNode top = null;

    public Stack(){
    }

    public void add(int x){
        //1. If first is null, just add
        if (top==null){
            top = new StackNode(x);
            return;
        }

        //2. Else
        StackNode add = new StackNode(x);
        StackNode current = top;
        while(current.next == null){
            current = current.next;
        }
        current.next = add;

    }
}