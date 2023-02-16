package com.sushant.algorithms.trees;

/**
 * 
 * @author Sushant
 *
 */
public class BinarySearchTree {

	Node root;

	public void insert(int value) {
		insert(this.root, value);
	}

	private Node insert(Node root, int value) {
		if (root == null) {
			root = new Node();
			root.data = value;
		} else if (value < root.data) {
			insert(root.left, value); // recursion
		} else if (value > root.data) {
			insert(root.right, value);
		}
		return root;
	}

	public void preOrderTraversal() {
		preOrderTraversal(this.root);
	}

	private void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public void inOrderTraversal() {
		inOrderTraversal(this.root);
	}

	private void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal() {
		postOrderTraversal(this.root);
	}

	private void postOrderTraversal(Node root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}

	/**
	 * Search in a binary tree
	 */
	public boolean contains(int value) {
		return contains(this.root, value);
	}

	private boolean contains(Node root, int value) {
		if (root == null) {
			return false;
		}
		if (value < root.data) {
			return contains(root.left, value);
		}
		if (value > root.data) {
			return contains(root.right, value);
		}
		return true;
	}

}
