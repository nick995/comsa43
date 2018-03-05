


public class ListNode<T> {

    private T data;
    private ListNode<T> next;
    private ListNode<T> prev;


    //**********************************************************************************************
    //          CONSTRUCTORS
    //**********************************************************************************************


    ListNode(){
        next=null;
        prev=null;
        data=null;
    }

    /*
        @param data the element
     */

    ListNode(T data) {
        this(data, null, null);
    }
    ListNode(T data, ListNode<T> next, ListNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Retrieves the data
     *
     * @return      the data
     */

    T getData() {
        return data;
    }

    /**
     * Retrieves the next node and return it
     *
     * @return      the next node
     */

    public ListNode<T> getNextNode() {
        return next;
    }

    /**
     * Retrieves the previous node
     *
     * @return      the previous node
     */


    public ListNode<T> getPrevNode() {
        return prev;
    }

    /**
     * Retrieves the previous node
     *
     * @return      the previous node
     */
    public void setPrevNode(ListNode<T> prev) {
        this.prev = prev;
    }
    /**
     * Retrieves the previous node
     *
     * @return      the previous node
     */

    public void setNextNode(ListNode<T> next) {
        this.next = next;
    }
    /**
     * Retrieves the previous node
     *
     * @return      the previous node
     */
    public void setData(T data) {
        this.data = data;
    }

}