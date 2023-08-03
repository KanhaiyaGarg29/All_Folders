
public class DoublyLL {
    private Node head;
    private Node tail;
    // private int size;

    // public DoublyLL() {
    //     this.size = 0;
    // }
    //insert at first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    //insert at last
    public void insertLast(int val){
        Node node=new Node(val);
        // tail.next=node;
        // node.next=null;
        // if(tail!=null){
        //     node.prev=tail;
        // }
        // tail=node;
        node.next=null;
        if(head==null){
           node.prev=null;
           head=node;
           return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=tail;
    }

    //insert after given node
    public void insertAfter(int after,int val){
         Node node=new Node(val);
         Node p=find(after);
         if(p==null){
            System.out.println("Node does not exoist");
            return;
         }
         node.next=p.next;
         p.next=node;
         node.prev=p;
         if(node.next!=null){
            node.next.prev=node;
         }
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    //display
    public void display(){
        Node temp=head;
        // Node last=null;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            // last=temp;
            temp=temp.next;
        }
        System.out.println("End");
        //display in reverse
        // while(last!=null){
        //     System.out.print(last.val+" -> ");
        //     last=last.prev;
        // }
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
}
