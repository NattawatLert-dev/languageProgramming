
import java.util.LinkedList;

public class A04linkedlists {
    public static void main(String[] args) {
        
        // LinkedList = stores Nodes in 2 parts (data + address)
        //              Nodes are in non-consecutive memory locations
        //              Elements are linked using pointers

        //                                     Singly Linked List
        //                       Node                Node                Node
        //                  [data | address] -> [data | address] -> [data | address]
        
        //                                     Doubly Linked List
        //                             Node                           Node
        //                  [address | data | address] <-> [address | data | address]
        
        //              adventages?
        //              1. Dynamic Data Structure (allocates needed memory while running)
        //              2. Insertion and Deletion of Nodes is easy. O(1)
        //              3. No/Low memory waste

        //              disadvantages?
        //              1. Greater memory usage (additional pointer)
        //              2. NO random access of elements (no index [i])
        //              3. Accessing/searching element is more time consuming. O(n)

        //              user?
        //              1. implement Stacks/Queues
        //              2. GPS navigation
        //              3. music playlist

        LinkedList<String> linkList = new LinkedList<String>();

        /* 
        linkList.push("A");
        linkList.push("B");
        linkList.push("C");
        linkList.push("D");
        linkList.push("F");
        linkList.pop();
        */

        // LinkedList as a Queue
        linkList.offer("A");
        linkList.offer("B");
        linkList.offer("C");
        linkList.offer("D");
        linkList.offer("F");
        //linkList.poll();

        linkList.add(4, "E");
        linkList.remove("E");
        System.out.println(linkList.indexOf("F"));
        System.out.println(linkList.peekFirst());
        System.out.println(linkList.peekLast());
        linkList.addFirst("0");
        linkList.addLast("G");
        String first = linkList.removeFirst();
        String last = linkList.removeLast();

        System.out.println(linkList);
        
    }
}
