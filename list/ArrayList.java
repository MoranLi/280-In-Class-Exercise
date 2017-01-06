/**
 * Created by yul04 on 2017/1/6.
 */
public class ArrayList<l> {

    protected l[] listElements;

    protected int capacity;

    protected int head;

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity){
        this.head = capacity -1;
        this.capacity = capacity;
        this.listElements = (l[])new Object[capacity];
    }

    public boolean isEmpty(){
       return this.head == this.capacity -1;
    }

    public boolean isFull(){
        return this.head < 0;
    }

    public void insertFirst(l a){
        if (this.isFull()){
            throw new RuntimeException("The list is already full");
        }
        this.listElements[this.head] = a;
        this.head--;
    }

    public void deleteFirst(){
        if(this.isEmpty()){
            throw new RuntimeException("The list is already empty");
        }
        this.head++;
        this.listElements[this.head] = null;
    }

    public l firstItem(){
        return this.listElements[head];
    }


}
