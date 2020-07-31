package allpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学 Composite 可以管理College
 * @author Liu
 * @version 1.0.0.1
 * @date 2020/7/30 16:17
 */
public class University extends OrganizationComponent {

    private List<OrganizationComponent> OrganizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        OrganizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        OrganizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("============"+getName()+"===========");
        for (OrganizationComponent organizationComponent : OrganizationComponents) {
            organizationComponent.print();
        }
    }
}
