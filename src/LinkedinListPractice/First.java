package LinkedinListPractice;

class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class First {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node x = new Node(arr[0],new Node(arr[1]));
        System.out.println(x.data + " " + x.next.data);
    }
}
