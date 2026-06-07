package LinkedinListPractice;

import java.util.Scanner;

class Node11{
    int data;
    Node11 next;
    Node11(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteTargetNode {
    public static Node11 DeleteNumber(Node11 head, int target){
        if (head==null){
            return null;
        }
        if (head.data == target){
            return head.next;
        }

        Node11 temp = head;

        while (temp.next!=null && temp.next.data!=target){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
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
        System.out.println("Enter Target : ");
        int target = sc.nextInt();

        Node11 head = new Node11(arr[0]);
        Node11 temp = head;
        for (int i = 1;i<a;i++){
            temp.next = new Node11(arr[i]);
            temp = temp.next;
        }

        head = DeleteNumber(head,target);

        temp = head;

        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
