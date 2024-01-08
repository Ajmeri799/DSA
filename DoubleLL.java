public class DoubleLL {



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
        Node newNode = new Node(data);
            if(head==null){
                 head=newNode;
                 return;
            }
            newNode.next=head;
              head=newNode;
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
}
