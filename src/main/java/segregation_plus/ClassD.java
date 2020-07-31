package segregation_plus;

public class ClassD implements TestInterface1, TestInterface3{
    @Override
    public void method1() {
        System.out.println("ClassD TestInterface1 method1");
    }

    @Override
    public void method4() {
        System.out.println("ClassD TestInterface3 method4");
    }

    @Override
    public void method5() {
        System.out.println("ClassD TestInterface3 method5");
    }
}
