package LinkedList.DoublyLinkedList;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1 prev;
    Node1(int data, Node1 next, Node1 prev){
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

public class Question2 {
    public static Node1 inserthead(Node1 head,int num){
        if (head == null){
            return new Node1(num);
        }
        Node1 newnode = new Node1(num);
        newnode.next = head;
        head.prev = newnode;
        return newnode;
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
        System.out.println("Number : ");
        int num = sc.nextInt();

        Node1 head = new Node1(arr[0]);
        Node1 prev = head;

        for (int i = 1;i<a;i++){
            Node1 temp = new Node1(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }

        head = inserthead(head,num);

        Node1 temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
