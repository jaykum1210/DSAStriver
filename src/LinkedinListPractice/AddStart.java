package LinkedinListPractice;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddStart {
    public static Node4 insertAtHead(Node4 head,int x){
        Node4 newNode = new Node4(x);
        newNode.next = head;
        return newNode;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        Node4 head = new Node4(arr[0]);
        Node4 temp = head;

        for(int i = 1;i<arr.length;i++){
            temp.next = new Node4(arr[i]);
            temp = temp.next;
        }
        Node4 newhead = insertAtHead(head,100);

        while (newhead!=null){
            System.out.println(newhead.data);
            newhead = newhead.next;
        }
    }
}
