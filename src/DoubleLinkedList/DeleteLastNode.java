package DoubleLinkedList;

import java.util.Scanner;

class Node4{
    int data;
    Node4 next;
    Node4 prev;
    Node4(int data, Node4 next, Node4 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node4(int data){
        this.data = data;
        this.next = null ;
        this.prev = null;
    }
}

public class DeleteLastNode {
    public static void traverse(int[] arr, Node4 head, Node4 prev){
        if (arr.length==0){
            return;
        }
        for (int i = 1;i< arr.length;i++){
            Node4 temp = new Node4(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
    }

    public static Node4 deleteLastNode(Node4 head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }
        Node4 temp = head;
        while (temp.next.next!=null){
             temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void printlist(Node4 head){
        if (head==null){
            return;
        }
        Node4 temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
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

        Node4 head = new Node4(arr[0]);
        Node4 prev = head;

        traverse(arr,head,prev);
        head = deleteLastNode(head);
        printlist(head);
    }
}
