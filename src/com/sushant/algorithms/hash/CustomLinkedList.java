package com.sushant.algorithms.hash;

import java.util.HashSet;

/**
 * 
 * @author Sushant
 *
 */
public class CustomLinkedList {

    Node head;

    public boolean hasCycle() {
        HashSet<Node> nodes = new HashSet<>();
        Node current = head;
        while (current != null) {
            if (nodes.contains(current)) {
                return true;
            } else {
                nodes.add(current);
            }
            current = current.next;
        }

        return false;
    }
}
