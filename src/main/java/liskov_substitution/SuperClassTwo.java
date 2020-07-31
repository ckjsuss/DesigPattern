package liskov_substitution;

/**
 * 协变实例
 * @author Liu
 */
public class SuperClassTwo {
    public Number caculate(){
        return null;
    }
}

class SubClassC extends SuperClassTwo{
    @Override
    public Integer caculate(){
        return null;
    }
}
class SubClassD extends SuperClassTwo{
    @Override
    public Double caculate(){
        return null;
    }
}

