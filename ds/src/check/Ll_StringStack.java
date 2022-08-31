package check;


public class Ll_StringStack {

    private Node head;
    private Node tail;
    private int count;

    private static class Node {
        String value;
        Node next;

        Node(String d) {
            value = d;
            next = null;
        }
    }

    public Ll_StringStack() {
        head = null;
        tail = null;
        count = 0;
    }

    public void push(String n) {
        if (count == 0) {
            head = new Node(n);
            tail = head;            
        } else {
            Node newNode = new Node(n);
            newNode.next = head;
            head = newNode;

        }

        count += 1;

    }

    public void pushf(String n) {
        if (count == 0) {
            head = new Node(n);
            tail = head;
        } else {
            Node newNode = new Node(n);
            tail.next = newNode;

            tail = newNode;

        }

        count += 1;

    }

    public String pop() throws Exception {
        if (count == 0) {
            throw new Exception("Nothing to pop");
        }
        String ret = head.value;
        head = head.next;
        count -= 1;
        return ret;
    }

    public void size() {
        System.out.println("The length of the linked list is " + count + ".");
    }

    public static void main(String[] args) throws Exception {

        Ll_StringStack list = new Ll_StringStack();
        list.push("hello");
        list.push("hell");
        list.push("hel");
        list.push("he");
        list.push("h");

        list.size();

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        list.pushf("1");
        list.pushf("2");
        list.pushf("3");

        System.out.println(list.pop());

        list.size();

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

    }

}
