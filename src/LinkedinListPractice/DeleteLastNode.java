package LinkedinListPractice;

import java.util.Scanner;

class Node10{
    int data;
    Node10 next;
    Node10(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteLastNode {
    public static Node10 deleteLast(Node10 head){
        if (head == null){
            return null;
        }
        Node10 temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
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

        Node10 head = new Node10(arr[0]);
        Node10 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node10(arr[i]);
            temp = temp.next;
        }

        head = deleteLast(head);

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
