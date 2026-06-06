package LinkedinListPractice;

import java.rmi.UnexpectedException;
import java.util.Scanner;

class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddBeforeNumber {
    public static Node7 addbeforetarget(Node7 head, int target, int num){
        if(head==null){
            return null;
        }
        if(head.data == target){
            Node7 newnode = new Node7(num);
            newnode.next = null;
            return newnode;
        }

        Node7 temp = head;

        while (temp.next!=null && temp.next.data!=target){
            temp = temp.next;
        }
        if (temp.next == null) {
            return head;
        }
        Node7 newnode = new Node7(num);
        newnode.next = temp.next;
        temp.next = newnode;
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
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        Node7 head = new Node7(arr[0]);
        Node7 temp = head;

        for(int i = 1;i<a;i++){
            temp.next = new Node7(arr[i]);
            temp = temp.next;
        }

        Node7 newnode = addbeforetarget(head,target,num);

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
