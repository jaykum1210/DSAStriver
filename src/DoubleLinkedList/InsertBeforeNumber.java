package DoubleLinkedList;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

class Node10{
    int data;
    Node10 next;
    Node10 prev;
    Node10(int data, Node10 next, Node10 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node10(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertBeforeNumber {
    public static void traverse(int[] arr, Node10 head, Node10 prev){
        if (arr.length==0){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node10 temp = new Node10(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
    }

    public static Node10 insertbefore(Node10 head, int num, int add){
        if (head==null){
            return null;
        }
        if (head.data == num){
            Node10 newnode = new Node10(add);
            newnode.next = head;
            head.prev = newnode;
            return newnode;
        }
        Node10 temp = head;
        while (temp!=null && temp.data!=num){
            temp = temp.next;
        }
        if (temp==null){
            return head;
        }
        Node10 newnode = new Node10(add);
        if (temp.prev!=null){
            temp.prev.next = newnode;
            newnode.prev = newnode;
        }
        if (temp.next!=null){
            temp.prev = newnode;
            newnode.next = temp;
        }
        return head;
    }

    public static void printlist(Node10 head){
        if (head==null){
            return;
        }
        Node10 temp = head;
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
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("Enter Number add : ");
        int add = sc.nextInt();

        Node10 head = new Node10(arr[0]);
        Node10 prev = head;

        traverse(arr,head,prev);
        head = insertbefore(head,num,add);
        printlist(head);
    }
}
