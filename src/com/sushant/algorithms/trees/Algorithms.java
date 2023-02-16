package com.sushant.algorithms.trees;

/**
 * 
 * @author Sushant
 *
 */
public class Algorithms {

    public static void main(String[] args) {

        //          5
        //       2        4
        //    9    10  7

        Node rootNode = new Node();
        rootNode.data = 5;
        Node nodeTwo = new Node();
        nodeTwo.data = 2;
        Node nodeFour = new Node();
        nodeFour.data = 4;
        Node nodeNine = new Node();
        nodeNine.data = 9;
        Node nodeTen = new Node();
        nodeTen.data = 10;
        Node nodeSeven = new Node();
        nodeSeven.data = 7;

        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.preOrderTraversal();
        System.out.println();

        tree.inOrderTraversal();
        System.out.println();

        tree.postOrderTraversal();
        System.out.println();

        
        //For search in a binary tree
        Node rootNode2 = new Node();
        rootNode2.data = 2;

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.root = rootNode2;

        tree2.insert(1);
        tree2.insert(3);
        tree2.insert(4);
        System.out.println(tree2.contains(1));
        System.out.println(tree2.contains(3));
        System.out.println(tree2.contains(8));
    }
}
