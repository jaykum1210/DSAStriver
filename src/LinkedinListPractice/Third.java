package LinkedinListPractice;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

public class Third {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        Node2 head = new Node2(arr[0]);
        Node2 temp = head;

        for(int i = 1;i< arr.length;i++){
            temp.next =new Node2(arr[i]);
            temp = temp.next;
        }

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}