package segregation_plus;

public class ClassB implements TestInterface1,TestInterface2{
    @Override
    public void method1() {
        System.out.println("ClassB TestInterface1 method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB TestInterface2 method2");
    }

    @Override
    public void method3() {
        System.out.println("ClassB TestInterface2 method3");
    }
}
