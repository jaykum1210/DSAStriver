package DoubleLinkedList;

import java.util.Scanner;

class Node6{
    int data;
    Node6 next;
    Node6 prev;
    Node6(int data, Node6 next, Node6 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node6(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DeleteNumberNode {
    public static void traverse(int[] arr, Node6 head, Node6 prev){
        if (arr.length==0){
            System.out.println("Empty Array");
            return;
        }
        for (int i = 1;i<arr.length;i++){
            Node6 temp = new Node6(arr[i]);
            prev.next = temp;
            temp.prev = prev;

            prev = temp;
        }
    }

    public static Node6 deleteNumber(Node6 head, int num){
        if (head==null){
            return null;
        }
        if (head.data==num){
            head = head.next;

            if (head!=null){
                head.prev = null;
            }
            return head;
        }

        Node6 temp = head;
        while (temp!=null && temp.data!=num){
            temp = temp.next;
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

    public static void printlist(Node6 head){
        Node6 temp = head;
        if (head==null){
            return;
        }
        while (temp!=null){
            System.out.println(temp.data);
            if (temp.prev!=null){
                System.out.println(temp.prev.data);
            }
            else{
                System.out.println("null");
            }
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

        Node6 head = new Node6(arr[0]);
        Node6 prev = head;
        traverse(arr,head,prev);
        head = deleteNumber(head,num);
        printlist(head);
    }
}