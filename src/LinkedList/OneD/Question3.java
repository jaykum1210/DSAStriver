package LinkedList.OneD;

import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

public class Question3 {
    public static Node2 deleteNode(Node2 head, int num){
        if (head==null){
            return null;
        }
        if (head.data == num){
            return head.next;
        }
        Node2 temp = head;
        while (temp.next!=null && temp.next.data!= num){
            temp = temp.next;
        }

        temp.next = temp.next.next;
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
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        Node2 head = new Node2(arr[0]);
        Node2 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node2(arr[i]);
            temp = temp.next;
        }

        head = deleteNode(head, num);

        temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
