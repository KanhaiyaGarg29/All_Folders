
public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }
    //insert at first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    } 
    //insert at last
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
       Node node=new Node(val);
       tail.next=node;
       tail=node;
       size++;
    }
    //insert at particular index
    public void insertAtIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
    }
    //delete at first
    public int deleteFirst(){
         int val=head.val;
         head=head.next;
         if(head==null){
            tail=null;
         }
       size--;
       return val;
    }

    //delete last
   
     public int deleteLast(){
         if(size<=1){
            return deleteFirst();
         }
         int val=tail.val;
        Node secondLast=head;
        while(secondLast.next.next!=null){
            secondLast=secondLast.next;
        }
        secondLast.next=null;
        tail=secondLast;
        return val;
     }

     //delete at particular index
     public int deleteAtIndex(int index){
       if(index==0){
           return deleteFirst();
       }
       if(index==size-1){
        return deleteLast();
       }
       Node temp=head;
       int i=0;
       while(i<index-1){
          temp=temp.next;
          i++;
       }
       int val=temp.next.val;
       temp.next=temp.next.next;
       return val;
     }
     //display
    public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+" -> ");
        temp=temp.next;
    }
    System.out.println("End");
}
//find node with given value
public Node find(int value){
    Node temp=head;
    while(temp!=null){
        if(temp.val==value){
            return temp;
        }
        temp=temp.next;
    }
    return null;
}

//insert using recursion
public void insertRecur(int val,int index){
    
}
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    
}