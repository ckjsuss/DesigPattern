package allpattern.composite;

import java.util.HashMap;

/**
 * 组装（组合模式）测试
 * @author Liu
 * @version 1.0.0.1
 * @date 2020/7/30 16:11
 */
public class CompositeTest {
    public static void main(String[] args){
        OrganizationComponent university = new University("清华大学","五道口职业大学");
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent informationCollege = new College("信息学院", "信息学院");
        OrganizationComponent softwareDepartment = new Department("软件工程", "高级码农工厂");
        OrganizationComponent networkDepartment = new Department("网络工程", "高级钳网线工工厂");
        OrganizationComponent infoDepartment = new Department("信息工程", "调试信号的");
        OrganizationComponent telDepartment = new Department("通讯工程", "搞搞通讯的");
        computerCollege.add(softwareDepartment);
        computerCollege.add(networkDepartment);
        informationCollege.add(infoDepartment);
        informationCollege.add(telDepartment);
        university.add(computerCollege);
        university.add(informationCollege);
        university.print();
        System.out.println("*************************");
        computerCollege.print();
        System.out.println("*************************");
        softwareDepartment.print();
        HashMap<String, String> map = new HashMap<>();

    }
    
    
}
