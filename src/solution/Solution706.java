package solution;

public class Solution706 {

    private static final int INITIAL_SIZE = 100;

    private final Node[] nodes;

    /**
     * Initialize your data structure here.
     */
    public Solution706() {
        this.nodes = new Node[INITIAL_SIZE];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int index = getBucket(key);
        if (nodes[index] == null) {
            nodes[index] = new Node(key, value);
        } else {
            Node temp = nodes[index];
            while (temp.next != null) {
                if (temp.key == key) {
                    temp.value = value;
                    break;
                }
                temp = temp.next;
            }
            if (temp.key == key) {
                temp.value = value;
                return;
            }

            temp.next = new Node(key, value);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int index = getBucket(key);
        if (nodes[index] == null) {
            return -1;
        }
        Node temp = nodes[index];
        while (temp.next != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }

        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int index = getBucket(key);
        if (nodes[index] == null){
            return;
        }
        Node temp = nodes[index];
        if (temp.key == key) {
            nodes[index] = nodes[index].next;
            return;
        }
        Node prev = null;
        while (temp != null){
            if (temp.key == key){
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Solution706 map = new Solution706();
        map.put(970, 538);
        map.put(908, 29);
        map.put(395, 865);
        map.put(250, 847);
        map.remove(836);
        map.put(233, 568);
        map.put(657, 790);
        map.put(595, 271);
        map.put(769, 219);
        map.put(55, 112);
        map.put(157, 493);
        map.get(920);
        map.put(632, 358);
        map.get(669);
    }

    private int getBucket(int arg) {
        return arg % INITIAL_SIZE;
    }

    static class Node {

        int key;

        int value;

        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
