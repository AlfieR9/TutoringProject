public class LinkedList {

    private LinkedNode head;

    public LinkedList() {
        this.head = null;
    }

    public void add(LinkedNode node) {
        
        if (this.head == null) {
            this.head = node;
        } else {
            LinkedNode current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            //WHEN there is NO next value
            current.setNext(node);
        }

    }

    public void printList() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            for (LinkedNode current = this.head; current != null; current = current.getNext()) {
                System.out.println(current.getValue());
            }
        }
        
    }

    public LinkedNode getHead() {
        return this.head;
    }

    /*public int get(int position) {
        //return the value at position "position"
        for (int i = 0; i < position ; i++) {

            LinkedNode current = this.head;

        }
    }*/

    public void removeTail() {
        LinkedNode current = this.head;
        if (current == null) {
        } else if (current.getNext() == null) {
            this.head = null;
        } else {
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
        }
    }

}