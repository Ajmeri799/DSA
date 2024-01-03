
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
              head=newNode;
              newNode.next=head;

        }

        public static void main(String[] args) {
            listL ll=new listL();
            ll.insertFirst("this");
            ll.insertFirst("is");

        }
    }


