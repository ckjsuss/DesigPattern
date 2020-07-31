package segregation;

public class ClassA {
    public void depend1(TestInterface t){
        t.method1();
    }

    public void depend2(TestInterface t){
        t.method2();
    }

    public void depend3(TestInterface t){
        t.method3();
    }
}
