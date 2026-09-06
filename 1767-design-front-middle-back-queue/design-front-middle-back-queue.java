class FrontMiddleBackQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Dummy head node
    Node head = new Node(-1);

    public FrontMiddleBackQueue() {

    }

    public void pushFront(int val) {
        Node temp = new Node(val);

        temp.next = head.next;
        head.next = temp;
    }

    public void pushMiddle(int val) {
        Node chank = new Node(val);

        // Find the size of the linked list
        int n = 0;
        Node memp = head.next;
        Node temp = head;

        while (memp != null) {
            n++;
            memp = memp.next;
        }

        // Find position before middle
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        chank.next = temp.next;
        temp.next = chank;
    }

    public void pushBack(int val) {
        Node tunk = new Node(val);

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = tunk;
    }

    public int popFront() {

        if (head.next == null) {
            return -1;
        }

        int ans = head.next.data;
        head.next = head.next.next;

        return ans;
    }

    public int popMiddle() {

        if (head.next == null) {
            return -1;
        }

        // Find size
        int n = 0;
        Node memp = head.next;
        Node temp = head;

        while (memp != null) {
            n++;
            memp = memp.next;
        }

        // Position before the middle
        int mid = (n - 1) / 2;

        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        int ans = temp.next.data;
        temp.next = temp.next.next;

        return ans;
    }

    public int popBack() {

        if (head.next == null) {
            return -1;
        }

        // Only one element
        if (head.next.next == null) {
            int ans = head.next.data;
            head.next = null;
            return ans;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        int ans = temp.next.data;
        temp.next = null;

        return ans;
    }
}