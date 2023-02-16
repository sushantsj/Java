package com.sushant.algorithms.linkedlist;

public class CustomLinkedList {

	Node head;

	public void displayContents() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * Delete the 2nd half of the list
	 */
	public void deleteBackHalf() {

		if (head == null || head.next == null) {
			head = null;
		}

		Node slow = head;
		Node fast = head;
		Node prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}

		prev.next = null;
	}

	/**
	 * Delete kth element from custom linkedlist from back of the list
	 * @param k
	 */
	public void deletekthElementFromBack(int k) {

		if (head == null || k == 0) {
			return;
		}

		Node first = head;
		Node second = head;

		for (int i = 0; i < k; i++) {
			second = second.next;
			if (second.next == null) { 
				if (i == k - 1) { //the list is equal to k
					head = head.next;
				}
			}
		}
		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;

	}
}
