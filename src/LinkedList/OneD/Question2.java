package LinkedList.OneD;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class Question2 {
    public static Node1 inserthead(Node1 head, int num){
        if (head==null){
            return new Node1(num);
        }

        Node1 newnode = new Node1(num);
        newnode.next = head;
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
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        Node1 head = new Node1(arr[0]);
        Node1 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node1(arr[i]);
            temp = temp.next;
        }

        head = inserthead(head,num);

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
