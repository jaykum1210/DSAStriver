package DoubleLinkedList;

import java.util.Scanner;

class Node7{
    int data;
    Node7 next;
    Node7 prev;
    Node7(int data, Node7 next, Node7 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node7(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertHeadNode {
    public static void traverse(int[] arr, Node7 head, Node7 prev){
        if (arr.length==0){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node7 temp = new Node7(arr[i]);
            prev.next = temp;
            temp.prev = prev;

            prev = temp;
        }
    }

    public static Node7 inderthead(Node7 head, int num){
        if (head == null){
            return new Node7(num);
        }
        Node7 newNode = new Node7(num);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
    public static void printlist(Node7 head){
        if (head == null){
            return;
        }
        Node7 temp = head;
        System.out.print("New Linked List : ");
        while (temp!=null){
            System.out.print(temp.data + " ");
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
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        Node7 head = new Node7(arr[0]);
        Node7 prev = head;

        traverse(arr,head,prev);
        head = inderthead(head,num);
        printlist(head);
    }
}
