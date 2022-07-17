package ue4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    /*
    Short note regarding actual interface

    The creation of the actual interface of the methods is unnecessary, as all methods and objects are defined
    and only used in a single class (Node class).
     */

    LinkedList<Node> linkedListTest;
    @BeforeEach
    void setup() {
        linkedListTest = new LinkedList<Node>();
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
        Node headNode = new Node("a");
        Node secondNode = new Node("g", headNode);
        Node lastNode = new Node("f", secondNode);


        assertEquals("[f, g, a]", lastNode.addOneNode(linkedListTest, lastNode));
    }

    @Test
    void deleteHeadNode() {
        LinkedList<Node> linkedListTest = new LinkedList();
        Node headNode = new Node("f");
        Node secondNode = new Node("g");
        Node lastNode = new Node("a");
        headNode.addOneNode(linkedListTest, headNode);
        secondNode.addOneNode(linkedListTest, secondNode);
        lastNode.addOneNode(linkedListTest, lastNode);
        assertEquals("[g, a]", lastNode.deleteHeadNode(linkedListTest));
    }

    @Test
    void reverseNode() {
        Node headNode = new Node("f");
        Node secondNode = new Node("g");
        Node lastNode = new Node("a");
        headNode.addOneNode(linkedListTest, headNode);
        secondNode.addOneNode(linkedListTest, secondNode);
        lastNode.addOneNode(linkedListTest, lastNode);
        assertEquals("[a, g, f]", lastNode.reverseNode(linkedListTest));
    }
}