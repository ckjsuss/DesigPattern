package demeter;

import java.util.ArrayList;
import java.util.List;

class SubCompanyManager {

    public List<SubEmployee> getAllEmployee(){
        List<SubEmployee> list = new ArrayList<SubEmployee>();
        for(int i=0; i<10; i++){
            SubEmployee emp = new SubEmployee();
            emp.setId("分公司:"+i);
            list.add(emp);
        }
        return list;
    }
}
