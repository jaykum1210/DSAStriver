package DoubleLinkedList;

import java.util.Scanner;

class Node8{
    int data;
    Node8 next;
    Node8 prev;
    Node8(int data, Node8 next, Node8 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node8(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertLastNode {
    public static void traverse(int[] arr, Node8 head, Node8 prev){
        if (arr.length == 0){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node8 temp = new Node8(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
    }
    public static Node8 insertlast(Node8 head, int num){
        if (head==null){
            return new Node8(num);
        }
        Node8 temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        Node8 newnode = new Node8(num);
        newnode.prev = temp;
        temp.next = newnode;
        return head;
    }
    public static void printlist(Node8 head){
        if (head==null){
            return;
        }
        Node8 temp = head;
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
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        Node8 head = new Node8(arr[0]);
        Node8 prev = head;

        traverse(arr,head,prev);
        head = insertlast(head,num);
        printlist(head);
    }
}
