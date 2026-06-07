package LinkedinListPractice;

import java.util.Scanner;

class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddAfterPosition {
    public static Node8 afterposition(Node8 head, int pos, int num){
        if(head == null){
            return null;
        }
        Node8 temp = head;
        int count = 0;
        while (temp!=null && count!=pos){
            count++;
            temp = temp.next;
        }
        if(temp==null){
            return head ;
        }

        Node8 newnode = new Node8(num);
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
        System.out.println("Enter Position : ");
        int pos = sc.nextInt();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        Node8 head = new Node8(arr[0]);
        Node8 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node8(arr[i]);
            temp = temp.next;
        }

        head = afterposition(head,pos,num);

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
