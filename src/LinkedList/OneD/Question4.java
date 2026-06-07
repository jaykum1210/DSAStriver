package LinkedList.OneD;

import java.util.Scanner;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

public class Question4 {
    public static int LinkedListLength(Node3 head){
        int count = 0;
        Node3 temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }

        Node3 head = new Node3(arr[0]);
        Node3 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node3(arr[i]);
            temp = temp.next;
        }

        int len = LinkedListLength(head);
        System.out.println("Length : " + len);
    }
}
