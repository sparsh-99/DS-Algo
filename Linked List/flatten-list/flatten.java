import java.util.*;

// Driver Code
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int d) {
        data = d;
        next = null;
        bottom = null;
    }
}

class Flatttening_A_LinkedList {
    Node head;

    void printList(Node node) {
        // Node temp = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.bottom;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
        while (t > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            Node temp = null;
            Node tempB = null;
            Node pre = null;
            Node preB = null;
            int flag = 1;
            int flag1 = 1;
            for (int i = 0; i < N; i++) {
                int m = arr[i];
                m--;
                int a1 = sc.nextInt();
                temp = new Node(a1);
                if (flag == 1) {
                    list.head = temp;
                    pre = temp;
                    flag = 0;
                    flag1 = 1;
                } else {
                    pre.next = temp;
                    pre = temp;
                    flag1 = 1;
                }
                for (int j = 0; j < m; j++) {
                    int a = sc.nextInt();
                    tempB = new Node(a);
                    if (flag1 == 1) {
                        temp.bottom = tempB;
                        preB = tempB;
                        flag1 = 0;
                    } else {
                        preB.bottom = tempB;
                        preB = tempB;
                    }
                }
            }
            // list.printList();
            GfG g = new GfG();
            Node root = g.flatten(list.head);
            list.printList(root);
            t--;
        }
    }
}


// My Code
class GfG {
    Node flatten(Node root) {
        Node head = null;
        Node itr = null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (root != null) {
            list.add(root.data);
            Node temp = root.bottom;
            while (temp != null) {
                list.add(temp.data);
                temp = temp.bottom;
            }
            root = root.next;
        }
        Collections.sort(list);
        for (int n : list) {
            if (itr == null) {
                itr = new Node(n);
                head = itr;
            } else {
                itr.bottom = new Node(n);
                itr = itr.bottom;
            }

        }
        return head;
    }
}