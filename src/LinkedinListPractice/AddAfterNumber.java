package LinkedinListPractice;

import java.util.Scanner;

class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddAfterNumber {
    public static Node6 AddAfterElement(Node6 head, int target, int num){
        Node6 temp = head;

        while (temp!=null && temp.data!=target){
            temp = temp.next;
        }
        if(temp==null){
            return head;
        }
        Node6 newnode = new Node6(num);
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
        Node6 head = new Node6(arr[0]);
        Node6 temp = head;

        for(int i = 1;i<a;i++){
            temp.next = new Node6(arr[i]);
            temp = temp.next;
        }

        Node6 newnode = AddAfterElement(head,target,num);

        temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
