import java.util.Scanner;

class Node {
    int data;
    Node right, down;

    Node(int data) {
        this.data = data;
        right = null;
        down = null;
    }
}

class Linked_list_2D_Matrix {
    // node of linked list

    static void display(Node head) {
        Node Rp;
        Node Dp = head;
        while (Dp != null) {
            Rp = Dp;
            while (Rp != null) {
                System.out.print(Rp.data + " ");
                Rp = Rp.right;
            }
            Dp = Dp.down;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int p = sc.nextInt();
                    arr[i][j] = p;
                }
            }
            Node head = Matrix.construct(arr, n);
            display(head);
        }
        sc.close();
    }
}

class Matrix {
    static Node construct(int arr[][], int n) {
        Node head = new Node(arr[0][0]);
        Node col = head;
        Node temp, row;
        for (int i = 0; i < n; i++) {
            row = col;
            for (int j = 1; j < n; j++) {
                temp = new Node(arr[i][j]);
                row.right = temp;
                row = row.right;
            }
            if (i != n - 1) {
                col.down = new Node(arr[i + 1][0]);
                col = col.down;
            }
        }
        return head;
    }
}