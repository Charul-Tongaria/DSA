import java.util.*;

public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add element at first
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //newnode next = head // linking step
        newNode.next = head;
        
        //head = newNode
        head = newNode;

    }

    //add element at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //print
    public void printll(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add at an index
    public void add(int index, int data){
        if(index == 0 ){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i= 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }

        //i=index-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove from first
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    //remove from last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }

    //iterative search
    public int itrSearch(int key){
        if(head == null){
            System.out.println("Empt LL");
            return -1;
        }
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    //helper fuction for recursive search
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    //recursive search
    public int recSearch(int key){
        return helper(head, key);
    }

    //reverse
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr; 
            curr= next;
        }
        head = prev;
    }

    //delete nth node from the end
    public void deletefromend(int n){
        //calculate size;
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;//remove 1st operation
            return;
        }

        int i=1;
        int idxtoFind = sz-n;
        Node prev = head;
        while(i<idxtoFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.printll();
        ll.addFirst(1);
        ll.printll();
        ll.addFirst(2);
        ll.printll();
        ll.addLast(3);
        ll.printll();
        ll.addLast(4);
        ll.printll();
        ll.add(2,9);
        ll.printll();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        ll.printll();
        System.out.println("Size = "+size);
        System.out.println(ll.itrSearch(9));
        System.out.println(ll.itrSearch(90));
        System.out.println(ll.recSearch(9));
        System.out.println(ll.recSearch(90));
        ll.reverse();
        ll.printll();
        ll.deletefromend(2);
        ll.printll();
    }
}