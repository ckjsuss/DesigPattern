package allpattern.composite;

import java.util.ArrayList;

/**
 * 学院 Composite 可以管理Department
 * @author Liu
 * @version 1.0.0.1
 * @date 2020/7/30 16:21
 */
public class College extends OrganizationComponent {

    /**
     * College 添加 Department
     */
    private ArrayList<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("======="+getName()+"========");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
