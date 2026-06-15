public class LinkedStringList {
    private Node head;
    private Node tail;
    private Node cursor;
    private int size;

    private static class Node {
        private String value;
        private Node previous;
        private Node next;

        private Node(String value) {
            this.value = value;
        }
    }

    public void add(String value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            cursor = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

        size++;
    }

    public boolean next() {
        if (cursor == null || cursor.next == null) {
            return false;
        }

        cursor = cursor.next;
        return true;
    }

    public boolean prev() {
        if (cursor == null || cursor.previous == null) {
            return false;
        }

        cursor = cursor.previous;
        return true;
    }

    public String current() {
        if (cursor == null) {
            return null;
        }

        return cursor.value;
    }

    public boolean deleteCurrent() {
        if (cursor == null) {
            return false;
        }

        Node nodeToDelete = cursor;
        Node previousNode = nodeToDelete.previous;
        Node nextNode = nodeToDelete.next;

        if (previousNode == null) {
            head = nextNode;
        } else {
            previousNode.next = nextNode;
        }

        if (nextNode == null) {
            tail = previousNode;
        } else {
            nextNode.previous = previousNode;
        }

        if (nextNode != null) {
            cursor = nextNode;
        } else {
            cursor = previousNode;
        }

        size--;
        return true;
    }

    public void sort() {
        if (size < 2) {
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            Node currentNode = head;

            while (currentNode.next != null) {
                String left = currentNode.value;
                String right = currentNode.next.value;

                if (left.compareToIgnoreCase(right) > 0) {
                    currentNode.value = right;
                    currentNode.next.value = left;
                    swapped = true;
                }

                currentNode = currentNode.next;
            }
        } while (swapped);

        cursor = head;
    }

    public boolean moveToHead() {
        if (head == null) {
            return false;
        }

        cursor = head;
        return true;
    }

    public boolean moveToTail() {
        if (tail == null) {
            return false;
        }

        cursor = tail;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toDetailedString() {
        if (head == null) {
            return "Liste ist leer.";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("Liste mit ").append(size).append(" Element(en): ");

        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode == cursor) {
                builder.append("[").append(currentNode.value).append("]");
            } else {
                builder.append(currentNode.value);
            }

            if (currentNode.next != null) {
                builder.append(" <-> ");
            }

            currentNode = currentNode.next;
        }

        builder.append("\nHinweis: Das Element in eckigen Klammern ist die Cursor-Position.");
        return builder.toString();
    }
}
