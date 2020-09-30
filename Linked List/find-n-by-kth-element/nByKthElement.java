import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class LinkedList {
    static Node head;

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            int k = sc.nextInt();
            System.out.println(GfG.nknode(head, k));
        }
        sc.close();
    }
}

class GfG {
    public static int nknode(Node head, int k) {
        Node slow = head;

        int ctr = 1;
        while (head.next != null) {
            head = head.next;
            slow = (ctr++ % k == 0) ? slow.next : slow;
        }
        return slow.data;
    }
}