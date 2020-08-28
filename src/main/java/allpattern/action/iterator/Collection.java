package allpattern.action.iterator;

import java.util.Iterator;

/**
 * @author Liu
 */
public interface Collection {

    /**
     * 添加元素
     *
     * @param o
     */
     void add(Object o);

    /**
     * 返回大小
     *
     * @return
     */
     int size();

    /**
     * 迭代方法
     *
     * @return
     */
     Iterator iterator();
}
