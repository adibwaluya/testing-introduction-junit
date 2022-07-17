package ue4;
import java.util.Collections;
import java.util.LinkedList;

public class Node {
    Node next;
    Object data;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data) {
        this.data = data;
    }

    public String toString() {
        if (next == null)
            return data.toString();
        else
            return data.toString() + ", " + next.toString();
    }

    public static Node fromString(String string) {
        String[] content = string.split(",");
        Node result = null;
        for (int i=content.length-1;i>=0;i--){
            result = new Node(content[i].trim(),result);
        }
        return result;
    }


    public String addOneNode(LinkedList<Node> linkedLIst ,Node abc){
        linkedLIst.add(abc);
        return linkedLIst.toString();
    }

    //
    public String deleteHeadNode(LinkedList<Node> linkedLIst){
        linkedLIst.remove();
        return linkedLIst.toString();
    }

    public String reverseNode(LinkedList<Node> linkedLIst){
        Collections.reverse(linkedLIst);
        return linkedLIst.toString();
    }

    public static void main(String[] args) {
        LinkedList<Node> linkedList = new LinkedList<Node>();


        Node headNode = new Node(4);
        Node secondNode = new Node(1);
        Node thirdNode = new Node(7);
        Node fourthNode = new Node(5);
        Node lastNode = new Node(9);

        headNode.addOneNode(linkedList, headNode);
        secondNode.addOneNode(linkedList, secondNode);
        lastNode.addOneNode(linkedList, lastNode);
        //System.out.println(linkedList);

        System.out.println("linkedList: " + linkedList);


        lastNode.reverseNode(linkedList);

        System.out.println("reversed linkedList: " + linkedList);


    }
}
