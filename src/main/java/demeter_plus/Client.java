package demeter_plus;

/**
 * 客户端
 * @author Liu
 */
public class Client {
    public static void main(String[] args){
        CompanyManager e = new CompanyManager();
        e.printAllEmployee(new SubCompanyManager());
    }
}
