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
    
    static Node construct(int arr[][],int n)
    {
        return rec(arr, n, 0, 0);
    }
    
    static Node rec(int arr[][], int n, int i, int j){
        if(i==n || j == n)
            return null;
        Node node = new Node(arr[i][j]);
        node.right = rec(arr, n, i, j+1);
        node.down = rec(arr, n, i+1, j);
        return node;
    }
}