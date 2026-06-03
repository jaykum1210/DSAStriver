package LinkedinListPractice;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class Second {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        Node1 head = new Node1(arr[0]);
        Node1 temp = head;

        for (int i = 1;i<arr.length;i++){
            temp.next = new Node1(arr[i]);
            temp = temp.next;
        }

        temp = head;
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
