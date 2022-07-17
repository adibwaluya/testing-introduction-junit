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

    public String deleteNodeOne(Object data){

        //convert the data to string
        String stringData = data.toString();

        //separate each element from
        char[] arr = stringData.toCharArray();

        //declare the linkedList
        LinkedList<String> list = new LinkedList<String>();

        //add each char in the linkedList
        for(int a = 0; a < stringData.length() ; a++){
            list.add(String.valueOf(arr[a]));
        }

        //remove the head from List
        list.remove();

        //return the rest of the list
        return list.toString();
    }


    public void deleteNode(int position) {

        // if linked list is empty
        if (next == null) return;

        Node temp = next;

        // If head needs to be removed
        if (position == 0) {
            next = temp.next; // Change head
            return;
        }

        // look for the previous node of the node that is going to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) return;

        // Store pointer to the next of node to be deleted
        Node nextNodeToBeDeleted = temp.next.next;

        temp.next = nextNodeToBeDeleted;

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
