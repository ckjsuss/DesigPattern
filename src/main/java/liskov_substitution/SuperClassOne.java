package liskov_substitution;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Liu
 */
public class SuperClassOne{
    public void methodA() throws Exception{}
}

class SubClassA extends SuperClassOne{
    @Override
    public void methodA() throws IOException {}
}

class SubClassB extends SuperClassOne{
    @Override
    public void methodA() throws FileNotFoundException {}
}

