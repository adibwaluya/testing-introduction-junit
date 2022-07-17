package ue4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @BeforeEach
    void setup() {
        LinkedList<Node> linkedListTest = new LinkedList();
        Node headNode = new Node(4);
        Node secondNode = new Node(1);
        Node lastNode = new Node(9);
    }

    @Test
    void testToString() {
        Node n = new Node(4);
        assertEquals(4, Integer.parseInt(n.toString()));
    }

    @Test
    void fromString() {
        Node n = Node.fromString("g,h,i");
        assertEquals("g, h, i", n.toString());
    }

    @Test
    void addOneNode() {
        LinkedList<Node> linkedListTest = new LinkedList();
        Node headNode = new Node(4);
        Node secondNode = new Node(1);
        Node lastNode = new Node(9);


    }

    @Test
    void deleteHeadNode() {
        LinkedList<Node> linkedListTest = new LinkedList();
        Node headNode = new Node(4);
        Node secondNode = new Node(1);
        Node lastNode = new Node(9);
    }

    @Test
    void reverseNode() {
    }
}