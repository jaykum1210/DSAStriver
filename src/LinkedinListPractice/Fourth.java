package LinkedinListPractice;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

public class Fourth {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node3 x = new Node3(arr[0]);

        Node3 head = new Node3(arr[0]);
        Node3 temp = head;

        for(int i = 1;i<arr.length;i++){
            temp.next = new Node3(arr[i]);
            temp = temp.next;
        }

        int sum = 0;
        temp = head;
        while (temp!=null){
            sum+=temp.data;
            temp = temp.next;
        }
        System.out.println("Sum : " + sum);
    }
}
