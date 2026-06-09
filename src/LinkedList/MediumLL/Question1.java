package LinkedList.MediumLL;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int data, Node1 next){
        this.data = data;
        this.next = next;
    }
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class Question1 {
    public static void traverse(int[] arr, Node1 head){
        if (arr.length==0){
            return;
        }
        Node1 temp = head;
        for (int i = 1;i<arr.length;i++){
            temp.next = new Node1(arr[i]);
            temp = temp.next;
        }
    }
    public static Node1 middlenodex(Node1 head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        Node1 left = head;
        Node1 right = head;
        while (right!=null && right.next!=null){
            left = left.next;
            right = right.next.next;
        }
        return left;
    }
    public static void printlist(Node1 head){
        if (head==null){
            return;
        }
        Node1 temp = head;
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
        Node1 head = new Node1(arr[0]);
        traverse(arr,head);
        Node1 newhead = middlenodex(head);
        printlist(newhead);
    }
}
