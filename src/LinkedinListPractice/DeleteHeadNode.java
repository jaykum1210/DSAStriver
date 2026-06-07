package LinkedinListPractice;

import java.util.Scanner;

class Node9{
    int data;
    Node9 next;
    Node9(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteHeadNode {
    public static Node9 deleteHead(Node9 head){
        if (head == null){
            return null;
        }
        return head.next;
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
        Node9 head = new Node9(arr[0]);
        Node9 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node9(arr[i]);
            temp = temp.next;
        }

        head = deleteHead(head);

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
