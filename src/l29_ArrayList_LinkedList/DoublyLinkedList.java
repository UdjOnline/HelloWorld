package l29_ArrayList_LinkedList;

import java.util.Iterator;

class DoubleNode {
    int data;
    DoubleNode prev; // ссылка на предыдущий узел
    DoubleNode next; // ссылка на следующий узел

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null; // по умолчанию предыдущий узел не задан
        this.next = null; // по умолчанию следующий узел не задан
    }
}

interface IntList {
    int get(int index);

    void add(int data);

    void add(int data, int index);

    void insertAtEnd(int data);

    void insertAtBeginning(int data);

    public boolean removeIndex(int index);

    int size();

    void clear();


    class DoublyLinkedList implements IntList {
        DoubleNode head; // начало списка
        DoubleNode tail; // конец списка
        int size; // размер списка

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        private DoubleNode getNode(int index) {
            if (index >= this.size && index >= 0)
                return null;

            int i = 0;
            DoubleNode node = this.head;

            while (i < index) {
                node = node.next;
                i++;
            }
            return node;
        }

        @Override
        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            DoubleNode result = head;
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
            return result.data;
        }

        @Override
        public void add(int data) {
            DoubleNode node = new DoubleNode(data);
            if (this.head == null) {
                this.head = node;
                this.tail = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
                this.tail = node;
            }
            size++;
        }

        @Override
        public void add(int data, int index) {
            if (index < 0 || index >= size) {
                //throw new IndexOutOfBoundsException();
            }
            DoubleNode node = new DoubleNode(data);
            if (index == 0) {
                add(data);
            }
            if (index == size) {
                tail.next = node;
                tail = node;
            }
            DoubleNode oldDoubleNode = head;
            for (int i = 0; i < index; i++) {
                oldDoubleNode = oldDoubleNode.next;
            }
            DoubleNode oldDoubleNodePrevious = oldDoubleNode.prev;
            oldDoubleNodePrevious.next = node;
            oldDoubleNode.prev = node;

            node.prev = oldDoubleNodePrevious;
            node.next = oldDoubleNode;
            size++;
        }

        @Override
        public void insertAtEnd(int data) {
            DoubleNode newDoubleNode = new DoubleNode(data);
            if (tail == null) {
                head = newDoubleNode;
                tail = newDoubleNode;
            } else {
                tail.next = newDoubleNode;
                newDoubleNode.prev = tail;
                tail = newDoubleNode;
            }
        }

        @Override
        public void insertAtBeginning(int data) {
            DoubleNode newDoubleNode = new DoubleNode(data);
            if (head == null) {
                head = newDoubleNode;
                tail = newDoubleNode;
            } else {
                newDoubleNode.next = head;
                head.prev = newDoubleNode;
                head = newDoubleNode;
            }
        }

        @Override
        public boolean removeIndex(int index) {
            DoubleNode node = getNode(index);
            if (node == null)
                return false;
            size++;

            if (this.size == 1) {
                this.head = null;
                this.tail = null;
                return true;
            } else if (this.size == 2 && index == 1) {
                node.prev.next = null;
                this.tail = node.prev;
                return true;
            } else if (this.size == 2 && index == 0) {
                node.next.prev = null;
                this.head = node.next;
                return true;
            }
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = null;
            node.prev = null;

            return true;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }

        // нужно добавить итератор
    }

class Main {
    public static void main(String[] args) {
        DoublyLinkedList dLL = new DoublyLinkedList();
        dLL.add(20);
        dLL.add(20,3);
        dLL.get(4);
        dLL.insertAtEnd(10);
        dLL.insertAtBeginning(5);
        dLL.removeIndex(3);
        dLL.clear();
    }
}
}