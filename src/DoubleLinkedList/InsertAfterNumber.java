package DoubleLinkedList;

import java.util.Scanner;

class Node9{
    int data;
    Node9 next;
    Node9 prev;
    Node9(int data , Node9 next, Node9 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node9(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertAfterNumber {
    public static void traverse(int[] arr, Node9 next, Node9 prev){
        if (arr.length==0){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node9 temp = new Node9(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
    }
    public static Node9 insertafternum(Node9 head, int num, int add){
        if (head==null){
            return null;
        }
        if (head.data==num){
            Node9 newnode = new Node9(add);
            newnode.prev = head;
            head.next = newnode;
            return head;
        }
        Node9 temp = head;
        while (temp!=null && temp.data!=num){
            temp = temp.next;
        }
        Node9 newnode = new Node9(add);

        if (temp==null){
            return head;
        }
        if (temp.next!=null){
            newnode.next = temp.next;
            temp.next.prev = newnode;
        }
        temp.next = newnode;
        newnode.prev = temp;
        return head;
    }
    public static void printlist(Node9 head){
        if (head==null){
            return;
        }
        Node9 temp = head;
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
        System.out.println("Enter Number After : ");
        int num = sc.nextInt();
        System.out.println("Enter Number Add : ");
        int add = sc.nextInt();

        Node9 head = new Node9(arr[0]);
        Node9 prev = head;

        traverse(arr,head,prev);
        head = insertafternum(head,num,add);
        printlist(head);
    }
}
