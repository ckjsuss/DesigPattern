package dependency_inversion_plus;

public class Email implements App {
    @Override
    public String getInfo(){
        return "Email Info!";
    }
}
