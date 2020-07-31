package allpattern.adaptor.class_adaptor;

/**
 * 目标类
 * @author Liu
 */
public class Phone{
    void charge(int outPut){
        if (outPut == 5) {
            System.out.println("charging");
        }else if(outPut > 5){
            System.out.println("boom");
        }else {
            System.out.println("can't charge");
        }
    }
}
