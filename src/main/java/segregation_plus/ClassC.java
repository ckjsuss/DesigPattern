package segregation_plus;

public  class ClassC{
    public void depend1(TestInterface1 t){
        t.method1();
    }

    public void depend4(TestInterface3 t){
        t.method4();
    }

    public void depend5(TestInterface3 t){
        t.method5();
    }
}
