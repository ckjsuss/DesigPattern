package segregation_plus;


public class ClassA{

    public void depend1(TestInterface1 t){
        t.method1();
    }

    public void depend2(TestInterface2 t){
        t.method2();
    }

    public void depend3(TestInterface2 t){
        t.method3();
    }
}
