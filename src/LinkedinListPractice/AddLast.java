package LinkedinListPractice;

class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddLast {
    public static Node5 insertAtLast(Node5 head, int x){
        if(head==null){
            return new Node5(x);
        }
        Node5 temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node5(x);
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node5 head = new Node5(arr[0]);
        Node5 temp = head;

        for (int i = 1;i<arr.length;i++){
            temp.next = new Node5(arr[i]);
            temp = temp.next;
        }

        Node5 newnode = insertAtLast(head,6);

        while (newnode!=null){
            System.out.println(newnode.data);
            newnode = newnode.next;
        }
    }
}
