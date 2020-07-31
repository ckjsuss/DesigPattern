package allpattern.composite;

/**
 * 机构组合抽象
 * @author Liu
 * @version 1.0.0.1
 * @date 2020/7/30 16:12
 */
public abstract class OrganizationComponent {
    private String  name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    /**
     * add 空实现
     * 叶子节点是无效做添加
     * @param organizationComponent
     */
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    /**
     * remove 空实现
     * 叶子节点是无效做添加
     * @param organizationComponent
     */
    protected void remove(OrganizationComponent organizationComponent){
        throw  new  UnsupportedOperationException();
    }

    /**
     *  print 抽象方法
     *  子类必须实现
     */
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
