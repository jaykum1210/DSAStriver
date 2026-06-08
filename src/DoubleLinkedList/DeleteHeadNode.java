package DoubleLinkedList;

import java.util.Scanner;

class Node3{
    int data;
    Node3 next;
    Node3 prev;
    Node3(int data,Node3 next, Node3 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node3(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DeleteHeadNode {
    public static void traverse(int[] arr, Node3 head, Node3 prev){
        if (arr.length==0){
            System.out.println("Array is Empty");
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node3 temp = new Node3(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
    }

    public static Node3 deleteheadnode(Node3 head){
        if (head==null){
            return null;
        }
        if(head.next == null){
            return null;
        }

        Node3 newnode = head.next;
        newnode.prev = null;
        return newnode;
    }

    public static void printdll(Node3 head){
        if (head == null){
            return;
        }
        Node3 temp = head;
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

        Node3 head = new Node3(arr[0]);
        Node3 prev = head;

        traverse(arr,head,prev);
        head = deleteheadnode(head);
        printdll(head);
    }
}