package allpattern.action.memento;

/**
 *  管理者
 * @author Liu
 */
public class CareTaker {
    private EmpMemento empMemento;
//    private List<EmpMemento> list = new ArrayList<EmpMemento>();    // 如果需要存储多个备份,可以使用集合

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}