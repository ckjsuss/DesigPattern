package allpattern.prototype;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable, Cloneable{
    private String Name;
    private String Color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
