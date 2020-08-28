package allpattern.proxy.cglib;

/**
 * @author Liu
 */
public  class UserDao {
    public void Speak(){
        System.out.println("speak........");
    }

    public int sum(String a){
        System.out.println("sum........");
        Integer i = 0;
        try {
            i = Integer.valueOf(a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }

    public final void get(){
        System.out.println("final get ........");
    }
}
