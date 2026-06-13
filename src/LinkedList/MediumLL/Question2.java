package LinkedList.MediumLL;

import java.util.HexFormat;
import java.util.Map;
import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
    Node2(int data, Node2 next){
        this.data = data;
        this.next = next;
    }
}

public class Question2 {
    public static Node2 reverse(Node2 head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        Node2 prev = null;
        Node2 curr = head;
        while (curr!=null){
            Node2 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter " + a + " Elements : ");
        for (int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Node2 head = new Node2(arr[0]);
        Node2 temp = head;
        for (int i = 1;i<arr.length;i++){
            temp.next = new Node2(arr[i]);
            temp = temp.next;
        }
        head = reverse(head);
        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
