class Dblyll {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void insertToBegin(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null){
            newnode.prev=temp;
            temp.next=newnode;
        }
    }

    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Dblyll list = new Dblyll();
        list.insertToBegin(100);
        list.insertToBegin(200);
        list.insertToBegin(300);
        list.printAll();
    }
}
