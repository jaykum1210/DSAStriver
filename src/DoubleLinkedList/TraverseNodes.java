package DoubleLinkedList;

import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data, Node2 next,Node2 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node2(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class TraverseNodes {
    public static void traverse(int[] arr, Node2 head, Node2 prev){
        for (int i = 1;i<arr.length;i++){
            Node2 temp = new Node2(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
    }

    public static void printdll(Node2 head){
        Node2 temp = head;
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
        Node2 head = new Node2(arr[0]);
        Node2 prev = head;

        traverse(arr,head,prev);
        printdll(head);
    }
}
