/**
 * Created by yul04 on 2017/1/6.
 */
public class LinkedList<l> {

    protected LinkedListNode<l> head;

    protected int numElement;

    public LinkedList(){
        this.head = null;
        this.numElement = 0;
    }

    public boolean isEmpty(){
        return this.head.getNext() == null;
    }

    public boolean isFull(){
        return false;    }


    public void insertFirst(l a){
        LinkedListNode<l> firstItem = new LinkedListNode<l>(a);
        firstItem.setNext(this.head);
        this.head = firstItem;
        this.numElement++;
    }

    public void deleteFirst(){
        if(this.head.isEmpty()){
            throw new RuntimeException("the list is already empty");
        }
        LinkedListNode deleteItem = this.head;
        this.head = this.head.getNext();
        deleteItem.setNext(null);
        this.numElement --;
    }

    public l firstItem(){
        return this.head.getItem();
    }

}
