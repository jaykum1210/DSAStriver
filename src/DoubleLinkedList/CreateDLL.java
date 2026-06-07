package DoubleLinkedList;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data, Node1 next,Node1 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node1(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CreateDLL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }

        Node1 head = new Node1(arr[0]);
        Node1 prev = head;

        for (int i = 1;i<a;i++){
            Node1 temp = new Node1(arr[i]);
            prev.next = temp;
            temp.prev = prev;

            prev = temp;
        }

        Node1 temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}