package allpattern.action.iterator;

import java.util.Iterator;

public class MyLinkedList implements Collection {
    /**
     * 头结点
     */
    private Node head = null;

    /**
     * 当前大小
     */
    private int size = 0;

    /**
     * 尾节点
     */
    private Node tail = null;

    /**
     * 添加元素
     * @param o
     */
    @Override
    public void add(Object o) {
        Node node = new Node(o, null);
        if (head == null) {
            head = node;
            tail = node;
            node.setNext(null);
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    /**
     * 获取长度
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    /**
     * 迭代器的内部类实现
     */
    private class LinkedListIterator implements Iterator {
        private Node currentNode = head;
        @Override
        public boolean hasNext() {
            if (currentNode == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            Node node = currentNode;
            currentNode = currentNode.getNext();
            return node;
        }
    }
}
