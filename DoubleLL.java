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


}
