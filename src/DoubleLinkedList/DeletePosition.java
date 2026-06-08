package DoubleLinkedList;

import java.util.Scanner;

class Node5{
    int data;
    Node5 next;
    Node5 prev;
    Node5(int data, Node5 next, Node5 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node5(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DeletePosition {
    public static void traverse(int[] arr, Node5 head, Node5 prev){
        if (arr.length == 0){
            System.out.println("Array Is Empty");
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node5 temp = new Node5(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
    }
    public static Node5 deleteposition(Node5 head, int pos){
        if (head==null){
            return null;
        }
        if (pos==0){
            head = head.next;

            if (head!=null){
                head.prev = null;
            }
            return head;
        }

        Node5 temp = head;
        int count = 1;
        while (temp!=null && count<pos){
            temp = temp.next;
            count++;
        }
        if (temp==null){
            return head;
        }
        if (temp.prev!=null){
            temp.prev.next = temp.next;
        }
        if (temp.next!=null){
            temp.next.prev = temp.prev;
        }
        return head;
    }
    public static void printlist(Node5 head){
        if (head==null){
            return;
        }
        Node5 temp = head;
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
        System.out.println("Enter Position : ");
        int pos = sc.nextInt();

        Node5 head = new Node5(arr[0]);
        Node5 prev = head;

        traverse(arr,head,prev);
        head = deleteposition(head,pos);
        printlist(head);
    }
}
