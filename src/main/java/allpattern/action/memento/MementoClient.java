package allpattern.action.memento;

/**
 * 备忘录 测试类
 *
 * @author Liu
 */
public class MementoClient {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("张三", 20, 2000);
        System.out.println("1.姓名:" + emp.getName() + ";  年龄:" + emp.getAge() + ";  薪水:" + emp.getSalary());
        // 备份
        taker.setEmpMemento(emp.memento());
        emp.setName("李四");
        emp.setAge(30);
        emp.setSalary(6000);
        System.out.println("2.姓名:" + emp.getName() + ";  年龄:" + emp.getAge() + ";  薪水:" + emp.getSalary());
        // 恢复
        emp.recovery(taker.getEmpMemento());
        System.out.println("3.姓名:" + emp.getName() + ";  年龄:" + emp.getAge() + ";  薪水:" + emp.getSalary());
    }
}
