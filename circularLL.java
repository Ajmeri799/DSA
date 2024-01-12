public class circularLL {

 Node head;
    public class Node {
        String data;
        Node next;
        Node pre;
        Node(String data) {
            this.data = data;
            this.next = null;
            this.pre=null;
        }
    }
    void insertFirst(String data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.pre=newnode;
        head=newnode;


    }

    public void treverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[]args){
        DoubleLL  du=new DoubleLL();
        du.insertFirst("1");
        du.insertFirst("2");
        du.insertFirst("3");
        du.insertFirst("4");
        du.insertFirst("5");
        du.treverse();
    }






}
