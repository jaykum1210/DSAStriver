package LinkedList.OneD;

import java.util.Scanner;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data;
        this.next = null;
    }
}

public class Question5 {
    public static boolean Searchelement(Node4 head, int num){
        if (head==null){
            return false;
        }
        Node4 temp = head;
        while (temp!=null){
            if(temp.data==num){
                return true;
            }
            temp = temp.next;
        }
        return false;
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

        Node4 head = new Node4(arr[0]);
        Node4 temp = head;

        for (int i = 1;i<a;i++){
            temp.next = new Node4(arr[i]);
            temp = temp.next;
        }

        System.out.println("Found : " + Searchelement(head, num));
    }
}
