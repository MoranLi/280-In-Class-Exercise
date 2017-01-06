/**
 * Created by yul04 on 2017/1/6.
 */
public class LinkedListNode<l> {

    protected  l item;

    protected  LinkedListNode<l> next;

    public LinkedListNode(l a){
        this.item = a;
        this.next = null;
    }

    public l getItem(){
        return this.item;
    }

    public boolean isEmpty(){
        return this.item == null;
    }

    public LinkedListNode<l> getNext(){
        return this.next;
    }

    public void setNext(LinkedListNode a){
        if (this.next == null){
            throw new RuntimeException("Here is the end of list");
        }
        this.next = a;
    }

}
