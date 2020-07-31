package segregation;

public class ClassC {
    public void depend1(TestInterface t){
        t.method1();
    }

    public void depend4(TestInterface t){
        t.method4();
    }

    public void depend5(TestInterface t){
        t.method5();
    }
}
