import java.util.List;
public class listL {
    Node head;
    public class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
            }
        }
        public void insertFirst(String data) {
            Node newNode = new Node(data);
            if(head==null){
                 head=newNode;
                 return;
            }
            newNode.next=head;
              head=newNode;
        }
   ////////////////////////////////////////////////////////////////////////////////////////////
        public void insertAtEnd(String data){
        Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node current=head;
            while (current.next!=null){
//                System.out.print(current.data+"->");
                current=current.next;

            }
            current.next=newNode;
//            newNode.data=data;
//            newNode.next=null;
//
        }


   //////////////////////////////////////////////////////////////////////////////////////////////////

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

        //--------------------------------------------DELETE--------------------------------------//
        public void deleteFirst(){
            if(head==null){
                System.out.println("under flow");
                return;
            }
            head=head.next;


        }


    public void deleteLast(){
        if(head==null){
            System.out.println("under flow");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node precurr=head;
//        Node current=precurr.next;
        Node current=head.next;
        while (current.next!=null){
            current=current.next;
            precurr=precurr.next;
        }
        precurr.next=null;
    }



        public static void main(String[] args) {
            listL ll=new listL();

            ll.insertFirst("is");
            ll.insertFirst("this");
             ll.treverse();
             ll.insertAtEnd("List");
            ll.treverse();
            ll.deleteFirst();
            ll.treverse();
            ll.deleteLast();
            ll.treverse();

     }
}
