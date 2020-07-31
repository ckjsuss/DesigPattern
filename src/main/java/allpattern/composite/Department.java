package allpattern.composite;

/**
 * Department
 * @author Liu
 * @version 1.0.0.1
 * @date 2020/7/30 16:25
 */
public class Department extends OrganizationComponent {
    public Department(String name,String des) {
        super(name,des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
