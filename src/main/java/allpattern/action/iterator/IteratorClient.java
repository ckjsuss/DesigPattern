package allpattern.action.iterator;

import java.util.Iterator;

/**
 * @author Liu
 */
public class IteratorClient {
    public static void main(String[] args) {
        Collection c1 = new MyLinkedList();
        for (int i = 0; i < 5; i++) {
            Object o = new Object();
            System.out.println("序号：" + i + " 对象：" + o);
            c1.add(o);
        }
        Iterator iterator1 = c1.iterator();
        while (iterator1.hasNext()) {
            Node o = (Node) iterator1.next();
            System.out.println(o.getData());
        }
    }
}
