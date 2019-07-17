package DataStructure;

import java.util.Scanner;

public class BinaryTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }


    Node root;


    BinaryTree() {
        root = null;
    }


    void insert(int key) {
        root = insertRec(root, key);
    }


    Node insertRec(Node root, int key) {


        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }

        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }


    void inorder()  {

        inorderRec(root);

    }

    void postorder()  {
        printPostorder(root);
    }

    void preorder()
    {
        printPreorder(root);
    }


    void inorderRec(Node root) {

        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }

    }


    void printPostorder(Node node)
    {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key + " ");

    }

    void printPreorder(Node node)
    {
        if(node == null)
            return;
        System.out.println(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }




    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder");
        tree.inorder();
        System.out.println("----------------------------------------");
        System.out.println("Postorder");
        tree.postorder();
        System.out.println("----------------------------------------");
        System.out.println("Preorder");
        tree.preorder();

    }
}
