package allpattern.action.iterator;

/**
 * @author Liu
 */
public interface Iterator {

    /**
     * 返回下一个对象
     * @return
     */
    Object next();

    /**
     * 是否还有下一个元素
     * @return
     */
    boolean hasNext();

}