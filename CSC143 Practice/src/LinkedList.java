public class LinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    /**
     * Retrieves the size of data
     *
     * @return      count
     */

    public int getSize(){
        int count = 0;
        if(head==null)
            return count;
        else{
            ListNode<T> temp=head;
            while (temp != null) {
                temp= temp.getNextNode();
                count++;
            }
            return count;
        }
    }
    
    /**
     * Adding data to front 
     * @parm        T data
     * 
     */

    public void insertAtBeg(T data){
        ListNode<T> newnode=new ListNode<T>(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.setNextNode(null);
            newnode.setPrevNode(null);
        }else{
            newnode.setNextNode(head);
            head.setPrevNode(newnode);
            head=newnode;
        }

    }
    
    /**
     * Adding data to End 
     * @parm        T data
     * 
     */
    public void insertAtEnd(T data){
        ListNode<T> newnode=new ListNode<T>(data);
        if(tail==null){
            head=newnode;
            tail=newnode;
            newnode.setNextNode(null);
            newnode.setPrevNode(null);
        }else{
            newnode.setPrevNode(tail);
            tail.setNextNode(newnode);
            tail=newnode;
        }
    }
    /**
     * Inserting the data to specific position 
     * 
     * @parm        T data, postion int
     * 
     */
    public void insertAtPosition(T data,int position){
        if(position<0||position==0){
            insertAtBeg(data);
        }
        else if(position>getSize()||position==getSize()){
            insertAtEnd(data);
        }else{

            ListNode<T>temp=head;
            ListNode<T> newnode=new ListNode<T>(data);
            for(int i=0;i<position-1;i++){
                temp=temp.getNextNode();
            }

            newnode.setNextNode(temp.getNextNode());
            temp.getNextNode().setPrevNode(newnode);
            temp.setNextNode(newnode);
            newnode.setPrevNode(temp);
        }
    }


    /**
     * removing the data 
     * @parm        ListNode node
     * 
     */
    private void remove(ListNode<T> node){
        if(node.getPrevNode()==null)
            head=node.getNextNode();
        else if(node.getNextNode()==null)
            tail=node.getPrevNode();
        else{
            ListNode<T> temp=node.getPrevNode();
            temp.setNextNode(node.getNextNode());

            node.getNextNode().setPrevNode(temp);
        }
        node=null;
    }
    /**
     * removing the data in specific position
     * @parm        int pos
     * 
     */
    public T remove(int position){
        T data=null;
        if(position==1){
            data=head.getData();
            head=head.getNextNode();
        }else if(position==getSize()){
            data=tail.getData();
            tail=tail.getPrevNode();
            tail.setNextNode(null);
        }else{
            ListNode<T> temp=head;
            for(int i=0;i<position;i++){
                temp=temp.getNextNode();
            }
            ListNode<T> node=temp.getNextNode();
            node.setPrevNode(temp.getPrevNode());
            temp.getPrevNode().setNextNode(node);
            temp=null;
        }
        return data;//Deleted node's data
    }
    /**
     * Changing the data to up
     * 
     * @parm        position int 
     * 
     */
   // public void moveUp(int position) {
       // if(position == 0) {
           // System.out.println("it can't be moved up!");
       // }
       // else if(position > this.getSize()) {
           // throw new IndexOutOfBoundsException("it can't be larger than list size!");
       // }
       // else {

           // ListNode<T> temp = current.getPrevNode();
           // ListNode<T> temp2 = current.getNextNode();
           // current.setPrevNode(temp.getPrevNode());
           // current.setNextNode(temp);
           // temp.setPrevNode(current);
           // temp.setNextNode(temp2);

       // }
   // }

    // public void moveDown(int position) {
        // if(position == 0) {
            // System.out.println("it can't be moved up!");
        // }
        // if(position > this.getSize()) {
            // throw new IndexOutOfBoundsException("it can't be larger than list size!");
        // }
    // }
    /**
     * retrive the front data 
     * 
     * @return head 
     * 
     */
    public ListNode<T> getHead() {
        return this.head;

    }
    
     /**
     * retrive the end data 
     * 
     * @return tail. 
     * 
     */
    public ListNode<T> getTail() {
        return this.tail;

    }
     /**
     * retrive the data in specific position
     * 
     * @return getData.
     * 
     */
    public T getAt(int index)
    {
        int size = 0;
        for(ListNode<T> temp = head; temp != null; temp = temp.getNextNode()) {
            if(index == size){
                return temp.getData();
            }
            ++size;
        }
        return null;
    }



}