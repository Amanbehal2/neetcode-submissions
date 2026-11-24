class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    int capacity;
    HashMap<Integer, Node> hm;
    Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        hm = new HashMap<>();
        
        // Dummy nodes to avoid null checks
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!hm.containsKey(key)) return -1;

        Node node = hm.get(key);
        moveToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            Node node = hm.get(key);
            node.value = value;
            moveToFront(node);
        } else {
            if (hm.size() == capacity) {
                Node lru = tail.prev;
                removeNode(lru);
                hm.remove(lru.key);
            }

            Node newNode = new Node(key, value);
            addToFront(newNode);
            hm.put(key, newNode);
        }
    }

    // Remove node from its current position
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Add node right after head
    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    // Move existing node to front
    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }
}
